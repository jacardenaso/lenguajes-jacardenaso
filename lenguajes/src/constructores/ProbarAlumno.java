/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.*;// para importar interfaces 
/**
 *
 * @author jr.armando
 */
public class ProbarAlumno {
    public static void main(String[] args)
    {
    Alumno a=new Alumno();
    Alumno a2=new Alumno("Armando");
        System.out.println("Tu nombre es " +a.getNombre());
        
        
//        JFrame ventana=new JFrame("hola");
//               ventana.setSize(200,120);
//               ventana.setVisible(true);
               
    }
}
