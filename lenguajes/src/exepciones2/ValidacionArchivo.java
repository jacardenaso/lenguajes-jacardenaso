/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones2;

import java.io.*;
/**
 *
 * @author jr.armando
 */
public class ValidacionArchivo {
 public static void validarExtencion(File file)throws ExtencionNoValidaExeption{
 
     
            //Preguntamo el nombre
     
           String nombre = file.getName();
           //como obtener la extension 
           int indice1= nombre.indexOf(".");
           int indice2= nombre.length();
           String extencion=nombre.substring(indice1-1,indice2);
           if(extencion.equals("txt")) throw new ExtencionNoValidaExeption();
        //throw new ExtencionNoValidaExeption();
 
        
     
     
 }
}
