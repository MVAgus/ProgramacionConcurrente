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
 class ThreadTesting {
     public static void main(String[] args){
         MiEjecucion miHilo = new MiEjecucion();
         Thread t1 = new Thread(miHilo);
         
         t1.start();
     
         System.out.println("En el main");
     }
    
}
