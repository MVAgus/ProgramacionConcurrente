/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author mano_
 */
public class GestorSala {
    
    private int cantTotal, cantActual = 0,tempUmbral,tempActual,cantJubilados;
    private Lock mutex;
    private final Condition jubilados;
    private Lock lockTemperatura;
    private int cantVisitasJubilados;
    private final Condition noJubilados;
    private int tempSala;
    
    private boolean hayJubilados = true;
    
    public GestorSala(int capacidadTotal,int umbral,int jubilados){
    
        this.cantTotal = capacidadTotal;
        this.tempUmbral = umbral;
        this.mutex = new ReentrantLock();
        this.jubilados = this.mutex.newCondition();
        this.noJubilados = this.mutex.newCondition();
        this.cantJubilados = jubilados;
        this.lockTemperatura = new ReentrantLock();
    }
    
    public void entrarSala() throws InterruptedException {
        //entrada de una persona normal
        
            mutex.lock();
            while (this.cantActual > this.cantTotal ||  hayJubilados) {
                System.out.println("Soy "+Thread.currentThread().getName()+"La sala esta llena hay que esperar para entrar");
                //esperan
                noJubilados.await();
            }
            //si puede entrar aumenta la cantidad de personas en la sala
            this.cantActual++;
            System.out.println("Soy "+Thread.currentThread().getName()+" estoy recorriendo la sala");
    
            mutex.unlock();
        }
    
      
    public void entrarSalaJubilado() throws InterruptedException{
          
            mutex.lock();
            
            while (this.cantActual >= this.cantTotal && hayJubilados) {
                System.out.println("Soy un jubilado tengo que esperar para entrar porque esta llena");
                jubilados.wait();
            }
            this.cantActual++;
            this.cantVisitasJubilados++;
            System.out.println("Soy "+Thread.currentThread().getName()+" estoy recorriendo la sala");
      
            mutex.unlock();
}
        
        
    
    
    public void salirSala(){
          mutex.lock();
           System.out.println("Muy lindo el museo,"+Thread.currentThread().getName()+" se va...");
          if (this.cantActual == this.cantJubilados || this.cantVisitasJubilados == this.cantJubilados){
              hayJubilados = false;
              this.noJubilados.signalAll();
          } else {
              this.jubilados.signal();
          }
          this.cantActual--;
         mutex.unlock();
        
    }
    
    public void setCantMaximaPersonas(int t){
       
        this.lockTemperatura.lock();
        this.cantTotal = t;
        System.out.println("Ahora la cantidad maxima de personas admitidas  es"+this.cantTotal+" y la cantidad"
                + "actual de personas en la sala es : "+this.cantActual);
        this.lockTemperatura.unlock();
  
    }
    }
    
