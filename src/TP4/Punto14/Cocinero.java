/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto14;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mano_
 */
public class Cocinero extends Persona implements Runnable {
    
    private Confiteria conf;

    public Cocinero(String nom,Confiteria conf) {
        super(nom);
        this.conf = conf;
    }
    
    
    public boolean atenderC() {
        boolean atendiendo = true;
        System.out.println("Hola buenos dias.Aqui tiene la carta ");
        try {
            Thread.sleep((int) (Math.random() * 200));
        } catch (InterruptedException e) {
             Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, e);
        }
        return atendiendo;
    }
    
    public void cocinar(){
        try {
            System.out.println("Estoy cocinando, no me tardo mucho");
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void run() {

        int cuantos = 0;

        System.out.println("Soy el cocinero " + this.nombre);

        while (true) {
            conf.esperarEmpleadoCocinero(nombre);
            this.atenderC();
            this.cocinar();
            cuantos++;
            System.out.println("Cocine a " + cuantos + " empleados");

        }

    }

}
