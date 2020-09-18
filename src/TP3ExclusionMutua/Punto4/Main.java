/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ExclusionMutua.Punto4;

/**
 *
 * @author mano_
 */
public class Main {
    public static void main (String[] args){
        
      
        Surtidor shell = new Surtidor();

            for (int i = 1; i <= 6; i++){
            Auto a = new Auto(Integer.toString(i),i,Integer.toString(i),shell);
            Thread ta = new Thread(a,Integer.toString(i));
            
            ta.start();
                
            }     
        
    }
}

