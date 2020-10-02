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
public class Ex2 {
    public static void main(String[]args) {
        
        MyThread th1 = new MyThread("th1");
        MyThread th2 = new MyThread("th2");
        MyThread th3 = new MyThread("th3");
        
        th1.start();
        th2.start();
        th3.start();
    }
    
}
