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
public class Task implements Runnable { //TODO exercise 7
    public static final long MAX = 100000000L;
    
    @Override
    public void run() {
        LocalTime start = LocalTime.now();
        System.out.println("Task " + Thread.currentThread().getName() + "with priority: " + Thread.currentThread().getPriority() + " started at " + start);
        long sum = 0;
        for (long i = 0; i < MAX; i++) // this creates a time-consuming loop
        {
            sum++;
            if (Thread.currentThread().getName().equals("Thread-0")) {
                System.out.println("Task " + Thread.currentThread().getName() + "yielded.");
                Thread.currentThread().yield();
            }
        }
        LocalTime finish = LocalTime.now();
        System.out.println("Task " + Thread.currentThread().getName() + " ended at " + finish
                + " after running for " + Duration.between(start, finish).toMillis()
                + " milliseconds, with sum = " + sum);
    } 
}
