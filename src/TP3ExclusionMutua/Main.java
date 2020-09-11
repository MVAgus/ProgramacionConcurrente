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
      
      
      
    

//---------------------------------------------
// Prueba del punto 3

//       Turno cod = new Turno();
//       Letra l1 = new Letra("A",cod);
//       
//       Thread a  = new Thread(l1);
//       
//       Letra l2 = new Letra("BB",cod);
//       Thread b  = new Thread(l2);
//       Letra l3 = new Letra("CCC",cod);
//       Thread c  = new Thread(l3);
//       a.start();
//       b.start();
//       c.start();
//       
      
//---------------------------------------------
   }
    
}
