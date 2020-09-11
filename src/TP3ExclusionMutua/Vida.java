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
public class Vida{
    
    private int cantidad = 10;
    
    public Vida(){
        
    }
    
    public synchronized void decrementarVida(){
        this.cantidad = this.cantidad - 3;
    }
    public synchronized int getCantidad(){
        return this.cantidad;
    }
    
    public synchronized void incrementarVida(){
        this.cantidad = this.cantidad + 3;
    }
}
