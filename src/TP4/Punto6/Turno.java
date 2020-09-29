/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Punto6;
import java.util.concurrent.Semaphore;

/**
 *
 * @author mano_
 */
public class Turno {
    
    private String[] arrLetras;
    private Semaphore semLetra1;
    private Semaphore semLetra2;
    private Semaphore semLetra3;
    
    public Turno(String[]arLet){
        //arLet es un string de letras
        semLetra1 = new Semaphore(1);
        semLetra2 = new Semaphore(0);
        semLetra3 = new Semaphore(0);
        this.arrLetras = arLet;
    }
   
    public void imprimir1(String letra,int cant){
        try {
        semLetra1.acquire();
        
        }
        catch (InterruptedException e){
        }
        for (int i = 0; i < cant; i++){
         System.out.print(letra);
        }
        semLetra2.release();
        
        
    }
        
        public void imprimir2(String letra,int cant){
        try {
             semLetra2.acquire();
       
            } catch (InterruptedException e){
                
        }
        for (int i = 0; i < cant; i++){
            System.out.print(letra);
        }
        semLetra3.release();
        }
        
        public void imprimir3(String letra,int cant){
            try {
            semLetra3.acquire();
       
            }
        catch (InterruptedException e){
        }
        for (int i = 0; i < cant; i++){
           System.out.print(letra);
        }
          semLetra1.release();
            
        }
        
        
        
    }
    
    
    
 
    
    
    
    
   
