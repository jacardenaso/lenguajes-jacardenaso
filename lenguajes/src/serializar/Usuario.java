/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;

/**
 *
 * @author SPR
 */
public class Usuario implements Serializable{
 
    private String Nomnbre;
    private String email;
    private int edad;

    public Usuario() {
    }

    public Usuario(String Nomnbre, String email, int edad) {
        this.Nomnbre = Nomnbre;
        this.email = email;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNomnbre() {
        return Nomnbre;
    }

    public void setNomnbre(String Nomnbre) {
        this.Nomnbre = Nomnbre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
}
