/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread3;

/**
 *
 * @author jr.armando
 */
public class LaMejor {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Soy el mejor");
            }
            
            
        });
        t1.start();
    }
}
