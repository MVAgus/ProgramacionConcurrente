/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Punto6Observatorio;

/**
 *
 * @author mano_
 */
public class Main {
    public static void main(String[] args) {
        
        
        Sala salaObv = new Sala();
        
        for (int i = 1; i < 15; i++){
            
            Visitante vs = new Visitante(salaObv);
            Thread tvs = new Thread(vs,"Visitante "+i);
            tvs.start();
        }
    }
    
}
