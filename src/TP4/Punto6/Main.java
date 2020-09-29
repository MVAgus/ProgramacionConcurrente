/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto6;

/**
 *
 * @author mano_
 */
public class Main {
    
    public static void main(String[] args){
        String[] ar = {"A","B","C"};
        Turno t = new Turno(ar);
        
        Letra l1 = new Letra("A",1,t);
        Letra l2 = new Letra("B",3,t);
        Letra l3 = new Letra("C",4,t);
        
        Thread t1 = new Thread(l1,"A");
        Thread t2 = new Thread(l2,"B");
        Thread t3 = new Thread(l3,"C");
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
