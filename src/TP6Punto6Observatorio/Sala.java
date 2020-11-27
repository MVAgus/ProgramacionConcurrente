/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto6Observatorio;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author mano_
 */
public class Sala {
    
    private int capacidadMaxima = 10;
    private int capacidadActual = 0;
    
    private int observacionesDiarias;
    
    private Condition esperaVisitantes;
    
    private int conSilla = 0;
    
    private Lock lockEntrada;
    public Sala(){
        this.lockEntrada = new ReentrantLock();
        this.esperaVisitantes = this.lockEntrada.newCondition();
        
    }
    
    public void ingresoVisitante(int op){
        
        switch (op){
            case 1: this.ingresoConSilla();
            break;
            case 2: this.ingresoSinSilla();
            break;
        }
    }
    
    private void ingresoConSilla() {
        try {
            this.lockEntrada.lock();

            while (this.capacidadActual > this.capacidadMaxima) {
                System.out.println(Thread.currentThread().getName() + " con silla, debe esperar porque la sala esta llena");
                this.esperaVisitantes.await();
            }
      
            System.out.println(Thread.currentThread().getName() + " con silla, esta entrando a la sala");
            if (this.conSilla == 0){ //si es el primer visitante en silla de ruedas , actualiza la capacidad de la sala
            this.capacidadMaxima = 5; //modifica la capacida
                System.out.println("Ahora la capacidad de la sala es de 5 personas");
            }
            this.conSilla++;
            this.capacidadActual++;

        } catch (InterruptedException ex) {

        } finally {
            this.lockEntrada.unlock();
        }

    }
    
    private void ingresoSinSilla() {
        try {
            this.lockEntrada.lock();

            while (this.capacidadActual > this.capacidadMaxima) {
                //es decir, que si ya la sala esta toda ocupada, la persona debe esperar
                System.out.println(Thread.currentThread().getName() + ", sin silla, la sala esta llena debo esperar");
                this.esperaVisitantes.await();
            }
            System.out.println(Thread.currentThread().getName() + ", sin silla, esta entrando a la sala");
            this.capacidadActual++;
        } catch (InterruptedException ex) {

        } finally {
            this.lockEntrada.unlock();
        }

    }

    public void retiroVisitante(int op) {
        try {
            this.lockEntrada.lock();

            if (op == 1) {
                System.out.println(Thread.currentThread().getName() + " en silla de ruedas, se retira de la sala");
                this.conSilla--;
                if (this.conSilla == 0) {
                    this.capacidadMaxima = 50;
                    System.out.println("Ahora la capacidad vuelve a ser de 10 personas");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " sin silla de ruedas, se retira de la sala ");
            }
            this.capacidadActual--;
            this.esperaVisitantes.signalAll();
        } finally {
            this.lockEntrada.unlock();
        }
    }
}
        
            
    
