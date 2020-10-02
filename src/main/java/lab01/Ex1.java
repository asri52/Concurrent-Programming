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
public class Ex1 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1, "t1");
        
        MyRunnable r2 = new MyRunnable();
        Thread t2 = new Thread(r1, "t2");
        
        MyRunnable r3 = new MyRunnable();
        Thread t3 = new Thread(r1, "t3");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}
