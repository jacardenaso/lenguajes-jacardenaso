/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.util.ArrayList;
import javax.print.DocFlavor;

/**
 *
 * @author Jr.Armando
 */
public class MainCliente {
  
    public static void main(String[] args){
    
    ArrayList<Cliente> clientes=new ArrayList<>();
    
    Cliente c1=new Cliente("Juan",20000,19);
    Cliente c2=new Cliente("Pedro",16500,23);
    Cliente c3=new Cliente("Ana",23000,20);
    
    
    //Al ArrayList:Clientes le agregamos uno a uno los tres clientes
    clientes.add(c1);
    clientes.add(c2);
    clientes.add(c3);
    
    
    //iteramos el ArrayList
    
    for (Cliente c:clientes){
        System.out.println(c);
        
    
    
    }
    
    }
    
}
