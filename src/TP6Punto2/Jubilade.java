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
public class Jubilade extends Persona {
    
    
    public Jubilade(GestorSala sala,String nom){
        super(sala,nom);
    }
    
    public void run(){
        sala.entrarSalaJubilado();
        this.recorrerySalir();
        
        
    }
    
    
}
