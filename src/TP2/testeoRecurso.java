/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2;

/**
 *
 * @author mano_
 */
public class testeoRecurso {
    public static void main (String[] args){
        Cliente juan = new Cliente();
        juan.setName("juan lopez");
        Cliente ines = new Cliente();
        ines.setName("ines garcia");
        juan.start();
        ines.start();
    }
}
