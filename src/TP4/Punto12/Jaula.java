/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto12;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mano_
 */
public class Jaula {
    
    //COLORES PARA LA CONSOLA
//    System.out.println("\033[34mHola soy un texto Azul");
//    System.out.println("\033[37mHola soy un texto Blanco");
//    System.out.println("\033[31mHola soy un texto Rojo");
//    System.out.println("\033[35mHola soy un texto Morado");        
//    System.out.println("\033[32mHola soy un texto Verde Claro");
//    System.out.println("\033[36mHola soy un texto Celeste");        
//    System.out.println("\033[33mHola soy un texto Amarillo");
    
    
    
    private ReentrantLock lockHamaca;
    private ReentrantLock lockComida;
    private ReentrantLock lockRueda;
    
    //Tengo 3 locks, uno para la hamaca otro para el plato de comida y otro para la rueda
    public Jaula(){
        lockHamaca = new ReentrantLock();
        lockComida = new ReentrantLock();
        lockRueda = new ReentrantLock();
    }
    
    
    public void alimentarse(){
       
        lockComida.lock();
        
        try {
            //El hamster se alimenta
            System.out.println("\033[34mEl hamster "+Thread.currentThread().getName()+" esta comiendo ");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally {
            System.out.println("\033[34mEl hamster "+Thread.currentThread().getName()+" termino de comer");
            lockComida.unlock();
        }
    }
    
    public void descansarEnHamaca(){
        lockHamaca.lock();
        try {
            //El hamster descansa
            System.out.println("\033[35mEl hamster "+Thread.currentThread().getName()+" esta descansando ");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally {
             System.out.println("\033[35mEl hamster "+Thread.currentThread().getName()+" ya descanso lo suficiente");
            lockHamaca.unlock();
        }
        
    }
    
    public void ejercitarse(){
        lockRueda.lock();
        try {
            //El hamster se ejercita
            System.out.println("\033[36mEl hamster "+Thread.currentThread().getName()+" esta ejercitandose ");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally {
            System.out.println("\033[36mEl hamster "+Thread.currentThread().getName()+" finalizo su rutina de gim");
            lockRueda.unlock();
        }
        
    }
}
