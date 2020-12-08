/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLinkedTransferQueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author mano_
 */
public class Buffer {
    
    private LinkedTransferQueue lista;
    private Semaphore mutexPoner;
    private Semaphore mutexSacar;
    
    public Buffer(){
        this.lista = new LinkedTransferQueue();
        this.mutexPoner = new Semaphore(1);
        this.mutexSacar = new Semaphore(1);
    }
    
   
    public void producir(int elem){
        try {
            
      
        this.mutexPoner.acquire();
        lista.add(elem);
        System.out.println("Se almaceno el elemento "+elem);
        this.mutexPoner.release();
        } catch (Exception e) {
        }
    }
    
    public void consumir(){
        try{
        this.mutexSacar.acquire();
        System.out.println("El consumidor "+Thread.currentThread().getName()+" consumio el producto"+lista.remove());
        this.mutexSacar.release();
        } catch (InterruptedException ex){
            
        }
    }
    
}
