/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Adri
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        int count = 0;
        for (;;) { // empty for loop creates an infinite loop, or use while(true)
        System.out.println("This thread is " + tname + " " + count++) ; 
        }
    }
    
}
