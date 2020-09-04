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
public class Main {
    public static void main (String args[]){
        
        Cliente c1 = new Cliente("Cliente 1", new int[]{2,2,1,5,2,3});
        Cliente c2 = new Cliente("Cliente 2", new int[]{1,3,5,1,1});
        
        Cajera cajera1 = new Cajera("Cajera 1");
        
        //tiempo inicial de ref
        long initialTime = System.currentTimeMillis();
        cajera1.procesarCompra(c1, initialTime);
        cajera1.procesarCompra(c2, initialTime);
    }
}
