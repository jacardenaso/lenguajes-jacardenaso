/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patos;

/**
 *
 * @author jr.armando
 */
public class PatoEuropeo extends Pato implements ComportamientoVolar{
      public static final String color="negro";

    @Override
    public void volar() {
         System.out.println("si vuelo ");
    }
      
}
