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
    
  
  
    public Auto(String matricula,int mod,String marca,Surtidor sr){
        super(matricula,mod,marca,sr);
    }
    
    public void run() {
        
            
            for (int i = 1; i <= 4; i++){
//            while (super.getSurtidor().getCapacidadActual() >= 0){
            boolean respuesta = this.andarKm(15);
            if (!respuesta) {
                this.cargarCombustible();
            }
           
            
        }
    }
    
}
