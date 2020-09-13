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
    
    private int capacidadTotal;
    private double actual;

    public Surtidor(int capacidadTotal, int actual) {
        this.capacidadTotal = capacidadTotal;
        this.actual = actual;
    }

    
    public synchronized double getActual() {
        return actual;
    }

    public synchronized void setActual(int pesos) {
        double cantLit = pesos*0.25;
        if (cantLit <= this.actual){
            this.actual = this.actual - cantLit;
            System.out.println("Litros cargados: "+cantLit);
        } else {
            System.out.println("No queda mas nafta disponible en el surtidor");
        }
        System.out.println("Cantidad de nafta restante en el surtidor "+this.actual);
    }
    
    
    
    
    
}
