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
public class Auto extends Vehiculo implements Runnable {
    
  
  
    public Auto(String matricula, int capacidadCombustible,double cantNf, int reserva){
        super(matricula,capacidadCombustible,cantNf,reserva);
    }
    
    public void run(){
        
        for (int i = 1; i <= 4; i++){
            Surtidor sr = new Surtidor(500,500);
            int km = i*5;
            try {
            if (this.andarKm(km)){
               System.out.println("El auto "+Thread.currentThread().getName()+" llego a la reserva");
               super.cargarCombustible(i*100,sr);
               Thread.sleep(2000);
            } else {
                System.out.println("El auto "+Thread.currentThread().getName()+" avanzo "+km+" km");
            }
            } catch (InterruptedException e){
             
            }
            
        }
        
    }
    
   
    
   

    
}
