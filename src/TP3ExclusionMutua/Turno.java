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
public class Turno {
    
    private String[] lista = {"A","BB","CCC"};
    private int turno = 0;
    
    public synchronized boolean esTurno(String caracter){
        return this.lista[turno].equals(caracter);
    }
    
    public void next(){
        this.turno = (turno+1) % 3;
    }
}
