/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto14;

import TP4.Punto13.*;

/**
 *
 * @author mano_
 */
public class Empleado extends Persona implements Runnable{
    
    private Confiteria unaConfiteria;
    private int opcion;

    public Empleado(String nom, Confiteria conf,int op) {
        super(nom);
        this.unaConfiteria = conf;
        this.opcion = op;
    } 
    
    private void caminarHastaConfiteria(){
        System.out.println("Soy "+nombre+" estoy yendo a la cafeteria."); 
         try {
            Thread.sleep((int) (Math.random() * 300));
        } catch (InterruptedException e) {
        }
    }
    
 
    @Override
    public void run() {
        this.caminarHastaConfiteria();
        if (unaConfiteria.entrar(nombre)) {
            //Si hay sillas disponibles el empleado se sienta y espera ser atendido
            unaConfiteria.solicitarAtencion(nombre,this.opcion);
            System.out.println("Soy " + nombre + " ya me atendieron, me voy..");
            unaConfiteria.salir(nombre);

        }
    }
    
 
}

    
    
