/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto2;


/**
 *
 * @author mano_
 */
public class Persona implements Runnable {
    
    private String nombre;
    GestorSala sala;
    
    
    
    public Persona(GestorSala sala, String nom){
        this.nombre = nom;
        this.sala = sala;
       
    }
    
    public void run(){
       this.sala.entrarSala();
       this.recorrerySalir();
       
    }
    
    public void recorrerySalir(){
        
        try {
            Thread.sleep(5000);
            this.sala.salirSala();
        } catch (Exception e) {
        }
        
    }
    
}
