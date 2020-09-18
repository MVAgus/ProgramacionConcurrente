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
    private int modelo;
    private String matricula;
    private int capacidadTanque = 20;
    private double cantNafta = 20;
    private int cantKm = 0;
    private Surtidor s;
    private int reserva = 5;
   
    
    
    
    
    public Vehiculo(String matricula,int mod,String marca,Surtidor s) {
        
        this.matricula = matricula;
        this.modelo = mod;
        this.marca = marca;
        this.s = s;
        
    }
    
    public boolean andarKm(int km){
        //los autos consumen cada 1 km 0.5 litros de nafta
        //si devuelve false es porque el auto llego a la reserva
        boolean respuesta = true;
        
        if (this.cantNafta > this.reserva){
            System.out.println("El auto "+Thread.currentThread().getName()+" avanzo: "+km+" km");
            this.cantKm += km;
            this.cantNafta = this.cantNafta - (0.5*km);
        } else {
            respuesta = false;
            System.out.println("El auto "+Thread.currentThread().getName()+"  llego a la reserva. Necesita nafta");
            }
        return respuesta;
        }
      
        
    
        public void cargarCombustible(){
        //Siempre que se carga combustible se llena el tanque
        //Se decrementan los litros del surtidor
        
//        double cantidadACargar = this.capacidadTanque-this.cantNafta;
        try {
           this.s.decrementar(20);
           this.cantNafta = 20;
           System.out.println("Ahora el auto"+Thread.currentThread().getName()+" tiene "+this.cantNafta+" lts de nafta");
           Thread.sleep(3000);
        }catch (InterruptedException e){
            
        }
        }
       

        public Surtidor getSurtidor(){
            return this.s;
        }
            
      
    }
    
    
    
    



























//    public void andarKm(int km) {
//       
//        this.cantKm += km;
//        
//        System.out.println("KM actual del auto "+Thread.currentThread().getName()+" es de"+this.cantKm);
//        this.cantNafta = this.cantNafta - (km * 0.25);
//        
//        if (cantNafta <= 5) {
//            System.out.println("El auto "+Thread.currentThread().getName()+" esta con la reserva");
//            cargarCombustible();
//        } 
//    }
//    
//    public void cargarCombustible(){
//        this.cantNafta = 20;
//        this.s.decrementar();
//    }
//    
//    public String getMatricula(){
//        return this.matricula;
//    }
    


