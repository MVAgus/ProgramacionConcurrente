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
public class Main {
    
    public static void main (String[] args){
        
        
        Turno turnos = new Turno();
        Letra l1 = new Letra("A",turnos);
        Letra l2 = new Letra("BB",turnos);
        Letra l3 = new Letra("CCC",turnos);
        
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);
        Thread t3 = new Thread(l3);
        
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
