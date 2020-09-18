/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ExclusionMutua.Punto3;

/**
 *
 * @author mano_
 */
public class Letra implements Runnable {
   
    private Turno t;
    private String nom;
    
   public Letra(String nom,Turno turno){
       this.nom = nom;
       this.t = turno;
   }
    
   
   public void run(){
       escribir();
   }
    
   private void escribir(){
       try {
       while (!t.esTurno(nom)){
           Thread.sleep(1000);
       } 
       System.out.println(this.nom);
       t.siguiente();
       } catch (InterruptedException e){
           
       }
   }
}
