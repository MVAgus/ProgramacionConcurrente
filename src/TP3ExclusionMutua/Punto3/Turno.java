/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ExclusionMutua.Punto3;

/**
 *
 * @author mano_
 */
public class Turno {
    
    private String[] a = {"A","BB","CCC"};
    private int turno = 0;
    
    
    public synchronized boolean esTurno(String nom) {
         
        return this.a[turno].equals(nom);
       
    }
    public void siguiente(){
        this.turno = (turno+1)%3;
    }
    
  
  

    
    
    
}
