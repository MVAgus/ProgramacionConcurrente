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
public class Letra implements Runnable {

    private String let;
    private int cantVeces;
    private Turno tur;

    public Letra(String letra, int cantV,Turno turno) {
        this.let = letra;
        this.cantVeces = cantV;
        this.tur = turno;

    }

    @Override
    public void run() {
        while (true){
        escribir();
        }
    }

    public void escribir() {
      if (Thread.currentThread().getName().equals("A")){
          this.tur.imprimir1("A",this.cantVeces);
       
      }
      if (Thread.currentThread().getName().equals("B")){
          this.tur.imprimir2("B", this.cantVeces);
      }
      if (Thread.currentThread().getName().equals("C")){
          this.tur.imprimir3("C", cantVeces);
      }
    }
}


