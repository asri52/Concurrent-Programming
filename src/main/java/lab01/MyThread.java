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
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        int count  = 0;
        for(;;) {
            System.out.println("Thread name: " + tname + " count: " + count++); 
        }
    }
}
