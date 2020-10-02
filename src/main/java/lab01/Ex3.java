/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author Adri
 */
public class Ex3 {
    public static void main(String[]args) {
        LocalTime start = LocalTime.now();
        
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        
        Task task0 = new Task();
        Thread t0 = new Thread(task0, "t0");
        
        Task task1 = new Task();
        Thread t1 = new Thread(task1, "t1");
        
        Task task2 = new Task();
        Thread t2 = new Thread(task2, "t2");
        
        t0.start();
        t1.start();
        t2.start();
        
        LocalTime finish = LocalTime.now();
        System.out.println("Main thread ended at " + finish
                + " after runing for " + Duration.between(start, finish).toMillis()
                + " milliseconds");
    }
}
