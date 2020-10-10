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
public class Hamster implements Runnable {
    
    private String nombre;
    private Jaula jaula;
    private char ob;
    
    public Hamster(String nom,Jaula j,char o){
        // el parametro o es para indicar que actividad desea realizar el hamster
        nombre = nom;
        jaula = j;
        ob = o;
    }
    
    public void run(){
        
 //Esta forma es para que cada los hamsters ejecuten las actividades uno detras de otro.
        
//      jaula.ejercitarse();       
//      jaula.descansarEnHamaca();
//      jaula.alimentarse();

//--------------------------------------------------------

/* Con este switch lo que hago es modelar el comportamiento de los hamsters
es decir mediante un char que se crea la hora de crear el objeto hamster.
*/
        
       switch (ob){
           case 'e': jaula.ejercitarse();
               break;
           case 'h': jaula.descansarEnHamaca();
               break;
           case 'a':jaula.alimentarse();
               break;
       } 
    }
}
