/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploHilos;

/**
 *
 * @author mano_
 */
public class Test {
    
    public static void main(String[] args){
        PingPong o1 = new PingPong("PING",30);
        PingPong o2 = new PingPong("PONG",10);
        
        PingPong o3 = new PingPong("PANG",15);
        
        PingPong o4 = new PingPong("PUNG",20);
        
        Thread t1= new Thread(o1);
        Thread t2= new Thread(o2);
        Thread t3= new Thread(o3);
        Thread t4= new Thread(o4);
        
        
        //activacion
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        for (int i = 0; i <= 100000; i++){
            System.out.println("hola");
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e){
                
            }
        }
        
        //espera unos segundos
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e){
            
        }
        //Finaliza la ejecucion delos threads
        
    }
}
    

