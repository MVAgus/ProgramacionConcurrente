/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto6Observatorio;

import java.util.Random;

/**
 *
 * @author mano_
 */
public class Visitante implements Runnable {
    
    private int opcion;
    private Sala salaOb;
    
    public Visitante(Sala sala){
       this.salaOb = sala;
       this.opcion = this.opcion = (int) (Math.random() * 2) + 1;
        
    }
    public void run(){
        
        this.salaOb.ingresoVisitante(this.opcion);
        this.realizarRecorrido();
        this.salaOb.retiroVisitante(this.opcion);
       
        
    }
    
    private void realizarRecorrido(){
        try {
        System.out.println(Thread.currentThread().getName()+" recorriendo sala...");
        Thread.sleep(1500);
        } catch(InterruptedException ex){
            
        }
    }
}
