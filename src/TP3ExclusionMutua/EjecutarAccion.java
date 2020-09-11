/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ExclusionMutua;

/**
 *
 * @author mano_
 */
public class EjecutarAccion implements Runnable {


private Vida vid = new Vida();

private void realizarAccion(){
    
    if (Thread.currentThread().getName().equals("Orco")){
        vid.golpear();
        System.out.println("El personaje "+Thread.currentThread().getName()+" realizo un golpe");
        System.out.println("La vida ahora es de "+vid.getCantidad());
    } 
    else {
        vid.curar();
        System.out.println("El personaje "+Thread.currentThread().getName()+ "realizo una curacion");
        System.out.println("La vida ahora es de "+vid.getCantidad());
    }
    
}

public void run(){
    this.realizarAccion();
}
    
    
}
