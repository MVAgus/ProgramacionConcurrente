/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mano_
 */
public class HiloTemperatura implements Runnable {
    
    
    
    private GestorSala sala;
    private int[]arregloTemp;
    private int indice = 0;
   
    private int tempHilo = 0;
    public HiloTemperatura (GestorSala sala){
        this.arregloTemp = new int[5];   
        this.sala = sala;
        this.arregloTemp[0] = 15;
        this.arregloTemp[1] = 20;
        this.arregloTemp[2] = 25;
        this.arregloTemp[3] = 30;
        this.arregloTemp[4] = 35;
        
    }
    
   
    
    public void run() {
        while (true) {
            try {
//                int t = (int) (Math.random() * 10) + 21;
                this.tempHilo = this.arregloTemp[indice];
                this.indice = 
                if (tempHilo >= 30) {
                    System.out.println("Se llego a la temperatura de umbral, la cantidad maxima de personas"
                            + "se decrementa");
                    this.sala.setCantMaximaPersonas(35);
                }
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloTemperatura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
      
