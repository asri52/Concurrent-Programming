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
public class Ex5 {

    static final int NUMTHREADS = 32;

    public static void main(String[] args) {
        System.out.println("This machine has "
                + java.lang.Runtime.getRuntime().availableProcessors()
                + " processors available");
        
        Thread[] threads = new Thread[NUMTHREADS];
        for (int i = 0; i < NUMTHREADS; i++) {
            threads[i] = new Thread(new Task());
        }

        threads[0].setPriority(Thread.MIN_PRIORITY);
        threads[1].setPriority(Thread.MAX_PRIORITY);

        for (int i = 0; i < NUMTHREADS; i++) {
            threads[i].start();
        }
    }

}
