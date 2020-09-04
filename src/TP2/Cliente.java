/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2;

/**
 *
 * @author mano_
 */
public class Cliente  {
    
    private String nombre;
    private int[] carroCompra;
    
    public Cliente(String nom,int[] a){
        this.nombre = nom;
        this.carroCompra = a;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public int[] getCarroCompra(){
        return this.carroCompra;
    }
   
    
    
    
}
