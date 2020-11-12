/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto2;

/**
 *
 * @author mano_
 */
public class main {
    
    public static void main(String[] args) {
        
        int jubilados = 30;
        
        GestorSala sala = new GestorSala(10,30,jubilados);
            
        for (int i = 1; i <= 50; i++){
            Persona p = new Persona(sala,"Persona"+i);
            Thread t1 = new Thread(p,"Persona"+i);
            t1.start();
        }
        
//        HiloTemperatura h = new HiloTemperatura(sala);
//        Thread h1 = new Thread(h);
//        h1.start();
        
        for (int j = 1; j <= jubilados; j++){
            Jubilade jb = new Jubilade(sala,"Jubilade"+j);
            Thread t2 = new Thread(jb,"Jubilade"+j);
            t2.start();
        }
    }
    
}
