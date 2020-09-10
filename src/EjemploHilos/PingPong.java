/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploHilos;

/**
 *
 * @author mano_
 */
public class PingPong extends Thread {
    
    private String cadena;
    private int delay;//info de las iteraciones
    private Dato miD; // para mantener el total
    private int miCta = 0; //para contar mis iteraciones
    
    public PingPong(String cartel,int cantMs){
        super(cartel);
        this.delay = cantMs;
    }
    
    public PingPong(String cartel, int cantMs, Dato dd){
        this(cartel,cantMs);
        this.miD = dd;
    }
    
    @Override
    public void run(){
        for (int i = 1; i < delay*2; i++){
            //System.out.println(cadena+"");
            miCta++;
            this.miD.contar();
   
        }
        System.out.println(miCta+ " veces "+this.getName());
    }
    
}

