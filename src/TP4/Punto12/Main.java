/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto12;

/**
 *
 * @author mano_
 */
public class Main {
    
    public static void main(String[] args){
        
        Jaula j = new Jaula();
        
        Hamster a = new Hamster("stuart",j,'a');
        Hamster b = new Hamster("ricki",j,'h');
        Hamster c = new Hamster("pinki",j,'e');
        Hamster d = new Hamster("twitch",j,'h');
        Hamster e = new Hamster("copernico",j,'a');
        
        Thread t1 = new Thread(a,"stuart");
        Thread t2 = new Thread(b,"ricki");
        Thread t3 = new Thread(c,"rocket");
        Thread t4 = new Thread(d,"twitch");
        Thread t5 = new Thread(e,"copernico");
//        
        t1.start();  
        t4.start();
        t2.start();
        t5.start();
        t3.start();
 
        
        
        
        
        
    }
}
