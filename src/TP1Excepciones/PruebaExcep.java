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
public class PruebaExcep {
    
    public static int edadPerson(int edad) throws RuntimeException {

        if (edad < 18) {
            throw new RuntimeException("La persona ingresada es menor de edad");
        } else {
            return edad;
        }
    }
        
    public static int ruleta(int num) throws RuntimeException{
        
        if (jugar() != num){
            throw new RuntimeException("Error");
        } else {
            return num;
        }
    }
    public static int jugar(){
        return 4;
    }
    
    public static void coleccion (int[]a){
        int pos = 0;
        while (pos <= 7){
            System.out.println(a[pos]);
            pos++;
        }
        
    }
           
    public static void main(String[] ars) {

//       edadPerson(15);
//       ruleta(9);
        int i = 0, num;
        int a[] = new int[5];
        while (i <= 4) {
            System.out.println("Ingrese un numero");
            num = TecladoIn.readInt();
            a[i] = num;
            i++;
        }

        coleccion(a);
    }
}
