/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto14;

import TP4.Punto13.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mano_
 */
public class Confiteria {
    Semaphore semCocinero;
    Semaphore semSilla;
    Semaphore semMozo;
    Semaphore semEmpleado;
    Semaphore semSalida;
    Semaphore mutexSillas;
    int sillasLibres = 2;
    String miNombre;

    public Confiteria(String nombreConf) {
        this.semSilla = new Semaphore(1);
        this.mutexSillas = new Semaphore(1);
        this.semMozo = new Semaphore(0);
        this.semEmpleado = new Semaphore(0);
        this.semSalida = new Semaphore(0);
        this.semCocinero = new Semaphore(0);
        this.miNombre = nombreConf;
    }
    
    public boolean entrar(String nombreEmpleado){
        //Este metodo verifica si el empleado puede sentarse en la confiteria
        boolean pudeEntrar = false;
        System.out.println("------------- soy " + nombreEmpleado + " estoy entrando.");
        try {
            // SECCION CRITICA
            mutexSillas.acquire();
            //El cliente verifica si hay sillas libres
            if (sillasLibres > 0 && sillasLibres <= 2) {
                //Ocupa una silla
                sillasLibres--;
                pudeEntrar = true;
            }else{
                System.out.println("Soy "+nombreEmpleado+" no encontre sillas disponibles para sentarme. ME VOY!");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }

        mutexSillas.release();
        sillasLibres++;
        return (pudeEntrar);
    }
        
       

    public void solicitarAtencion(String nombreEmpleado,int opcion) {
        try {
            // SECCION CRITICA

            semSilla.acquire();
            System.out.println("Soy " + nombreEmpleado + " me podria traer la carta por favor?");
            switch (opcion){
                case 0: servirBebida(); //Solo se sienta un rato y bebe algo
                        retirarBebida();
                        terminaDeBeber();
                break;
                case 1: servirComida();
                        retirarPlatos();
                        terminaDeComer();
                break;
                case 2: servirBebida();
                        servirComida();
                        retirarPlatos();
                        retirarBebida();
                        terminaDeComer();
                        terminaDeBeber();
                break;
                default : System.out.println("Opcion incorrecta");
            }
          
            semEmpleado.acquire();

        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

    public void esperarEmpleadoMozo(String nombreMozo) {
        //simula tiempo de espera del mozo
        System.out.println("Soy el mozo"+nombreMozo+" me voy inventar nuevas recetas!");
        try {
            semMozo.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void esperarEmpleadoCocinero(String nombreCocinero){
        //simula tiempo de espera del cocinero
        System.out.println("Soy el cocinero "+nombreCocinero+" me voy a limpiar mi cocina");
        try {
            semCocinero.acquire();
        } catch(InterruptedException ex){
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void elegirMenu(String nombreEmpleado) {
        try {
            System.out.println("Soy " + nombreEmpleado + " estoy mirando la carta");
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * public void empiezaAComer(){ try {
     *
     * System.out.println("Excelente comida! Esta muy sabrosa."); } catch
     * (InterruptedException ex) {
     * Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
     * } }
     */
    public void terminaDeComer() {
        //El empleado se retira de la confiteria
        semEmpleado.release();
        System.out.println("Muy rica la comida, nos vemos!");
    }
    public void terminaDeBeber(){
        semEmpleado.release();
        System.out.println("Muy refrescante la bebida, nos vemos");
    }

    public void salir(String nombreEmpleado) {
        semSilla.release();
    }
    
    public void servirComida(){
        try {
            semCocinero.release();
            System.out.println("Aqui tiene su comida");
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        retirarPlatos();
        
        
    }
    
    public void retirarPlatos(){
        semEmpleado.release();
        System.out.println("Espero que le haya gustado la comida");
        
    }
    
    public void servirBebida(){
        semMozo.release();
        System.out.println("Aqui tiene su bebida");
        
    }
    public void retirarBebida(){
        semEmpleado.release();
        System.out.println("Gracias por la visita. Hasta Luego");
        
    }

}
    

    
