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
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int capacidadCombustible;
    private double cantidadCombustible;
    private int kmService;
    private int kilometraje;
    private int reserva;
    
    
    
    
    public Vehiculo(String matricula, int capacidadCombustible,double cantNafta, int reserva) {
        
        this.matricula = matricula;
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadCombustible = cantNafta;
        this.reserva = reserva;
      
    }
    
    public boolean andarKm(int km) {
        //si devuelve true es porque el auto llego a la reserva
        // cada auto cada 1 km consume 0.25 litros de nafta
        boolean respuesta = false;
        this.kilometraje += km;
        System.out.println("Ahora el kilometraje del auto "+Thread.currentThread().getName()+" es de"+this.kilometraje);
        this.cantidadCombustible = this.cantidadCombustible - (km * 0.25);
        if (this.cantidadCombustible <= this.reserva) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public void cargarCombustible(int pesos,Surtidor s) {

        s.setActual(pesos);

    }    
    }

