/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ExclusionMutua.Punto4;

/**
 *
 * @author mano_
 */
public class Main {
    public static void main (String[] args){
        
      
        Auto a1 = new Auto("Auto 1",40,10,5);
        Auto a2 = new Auto("Auto 2",30,15,5);
        
        Thread t1 = new Thread(a1,"Auto1");
        Thread t2 = new Thread(a2,"Auto2");
        

        t2.start();
        t1.start();
    }
    
}
