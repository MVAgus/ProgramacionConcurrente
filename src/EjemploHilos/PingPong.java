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
public class PingPong extends Thread {
    
    private String cadena; //Lo que va escribir
    private int delay;//Tiempo entre escritura
    public PingPong(String cartel,int cantMs){
        cadena = cartel;
        delay = cantMs;
    }
    
    public void run(){
        for (int i = 1; i < delay*10; i++){
            System.out.println(cadena+"");
//        try {
//            Thread.sleep(delay);
//        } catch (InterruptedException e){
//            
//        }
        }
    }
}
