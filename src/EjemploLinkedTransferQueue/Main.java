/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLinkedTransferQueue;

/**
 *
 * @author mano_
 */
public class Main {
    
    public static void main(String[] args) {
        
        Buffer bff= new Buffer();
        
        for (int i = 1; i<= 10; i++){
        Productor p1 = new Productor(bff);
        Thread t1 = new Thread(p1,"Productor p "+i);
        t1.start();
        }
        try {
            
        
        Thread.sleep(2000);
        Consumidor p2 = new Consumidor(bff);
        Thread t2 = new Thread(p2,"Consumidor 1");
        t2.start();
        
        Consumidor p3 = new Consumidor(bff);
        Thread t3 = new Thread(p3,"Consumidor 2");
        t3.start();
         } catch (Exception e) {
        }
        
        
        
    }
    
    
}
