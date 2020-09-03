/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1Excepciones;

/**
 *
 * @author mano_
 */
public class Dos {
    private static int metodo(){
        int valor = 0;
        
        try {
            //bloque 1
            valor = valor +1;
            valor = valor + Integer.parseInt("W");
            //aca salta al bloque del catch 
            valor = valor +1;
            System.out.println("Valor al final del try "+valor);
        }catch (NumberFormatException e){
            //bloque 2
            valor = valor + Integer.parseInt("42");
            System.out.println("valor al final del catch "+ valor);
        } finally {
            //bloque 3
            valor = valor + 1;
            System.out.println("valor al final del finally "+valor);
        }
        //bloque 4
        valor = valor + 1;
        System.out.println("valor antes del return "+valor);
        return valor;
    }
    
    public static void main (String[]ars){
        
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
    
}
