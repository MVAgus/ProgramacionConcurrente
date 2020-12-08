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
public class Consumidor implements Runnable {
    
    private Buffer buff;
 
    
    public Consumidor(Buffer bf){
        
        this.buff = bf;
       
    }
    
    public void run(){
        
        while (true){
            try {
                buff.consumir();
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            
        }
    }
    
   
}

