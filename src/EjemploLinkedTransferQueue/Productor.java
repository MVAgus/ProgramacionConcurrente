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
public class Productor implements Runnable {
    
    private Buffer buff;
    
    
    public Productor(Buffer bf){
        
        this.buff = bf;
       
    }
    
    public void run(){
        
        while (true){
            try {
                buff.producir((int)(Math.random()*100));
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            
        }
    }
}
