/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto14;

import TP4.Punto13.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mano_
 */
public class PollosHermanos {
    
    public static void main(String[]args){
        
       
        Confiteria unaConfiteria = new Confiteria("El cafecito");
        Mozo unMozo = new Mozo("Borges", unaConfiteria);
        Cocinero cocinero = new Cocinero("Carlitos",unaConfiteria);
        
        Thread hiloMozo = new Thread(unMozo);
        Thread hiloCocinero = new Thread(cocinero);
        hiloMozo.start();
        hiloCocinero.start();
        
        Thread [] hiloEmpleado = new Thread[6];
        
        Empleado e1 = new Empleado("richard",unaConfiteria,0);
        Empleado e2 = new Empleado("juan",unaConfiteria,0);
        Empleado e3 = new Empleado("mau",unaConfiteria,0);
        
        Thread t1 = new Thread(e1,"richard");
         Thread t2 = new Thread(e2,"juan");
          Thread t3 = new Thread(e3,"mau");
          
          t1.start();
          t2.start();
          t3.start();
    }
        
        
//        for(int i = 0; i<hiloEmpleado.length; i++){
//            Empleado unEmpleado = new Empleado("Empleado "+i, unaConfiteria);
//            hiloEmpleado[i] = new Thread(unEmpleado);
//            hiloEmpleado[i].start();
//        }
//        
//        try{
//            Thread.sleep((int) (Math.random() * 500));
//            
//        }catch(InterruptedException ex){
//            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
    
    

