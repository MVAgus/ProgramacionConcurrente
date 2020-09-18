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
public class Surtidor {
    
    private double capacidadTotal = 1000;
    private double capacidadActual = 1000;
    private double precioPorLitro = 46;
  

    public synchronized double getCapacidadActual() {
        return this.capacidadActual;
    }
    
    public synchronized double getCapacidadTotal(){
        return this.capacidadTotal;
    }

    public synchronized void decrementar(double litrosACargar) {
        //el surtidor esta aca en cipolleti y el litro de nafta esta a $46
        
        if (this.capacidadActual > litrosACargar){
            //hay nafta disponible en el surtidor
            this.capacidadActual = this.capacidadActual - litrosACargar;
            System.out.println("Litros cargados: "+litrosACargar);
        } else {
            System.out.println("No hay nafta disponible en el surtidor");
        }
        System.out.println("Cantidad de nafta en el surtidor: "+this.capacidadActual);
        
    }
    
    public double getPrecioPorLitro(){
        return this.precioPorLitro;
    }
    
    
    
    
    
}
