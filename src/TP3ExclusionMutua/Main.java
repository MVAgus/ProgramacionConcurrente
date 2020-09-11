/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ExclusionMutua;

/**
 *
 * @author mano_
 */
public class Main {
    
   public static void main (String[] args){
       
//--------------------------------------------
//       Prueba del punto 1
//       VerificarCuenta vc = new VerificarCuenta();
//       Thread Luis = new Thread(vc,"Luis");
//       Thread Manuel = new Thread(vc,"Manuel");
//       Luis.start();
//       Manuel.start();
//---------------------------------------------


      EjecutarAccion acc = new EjecutarAccion();
      Thread Orco = new Thread(acc,"Orco");
      Thread Curandero = new Thread(acc,"Curandero");
      
      Orco.start();
      Curandero.start();
    
      
      
      
   }
    
}
