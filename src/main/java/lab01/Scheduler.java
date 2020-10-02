/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.time.LocalTime;

/**
 *
 * @author Adri
 */
public class Scheduler implements Runnable {

    private long interval;
    private Thread schedulerThread;

    public Scheduler(long time) {
        interval = time;
        schedulerThread = new Thread(this);
        schedulerThread.setPriority(Thread.MAX_PRIORITY);
        schedulerThread.setDaemon(true);
        schedulerThread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Scheduler wakened at " + LocalTime.now());
                Thread.sleep(interval);
            } catch (InterruptedException ex) {
                /* ignore exception */
            }
        }
    }

}
