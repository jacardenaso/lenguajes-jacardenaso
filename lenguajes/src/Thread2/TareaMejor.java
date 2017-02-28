/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread2;

/**
 *
 * @author jr.armando
 */
//segunda forma de crear threads implementando la interface runnable
public class TareaMejor implements Runnable{
    public static void main(String[] args) {
        
        
        //crear thread
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        //iniciarlo
    }

    @Override
    public void run() {
        System.out.println("soy un mejor thread");  
    }
   
}

