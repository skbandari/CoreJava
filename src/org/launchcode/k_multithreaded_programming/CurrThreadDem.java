package org.launchcode.k_multithreaded_programming;

public class CurrThreadDem {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        Thread newThread = new Thread();
        currentThread.setName("Current Thread");
        System.out.println(currentThread);
        System.out.println(newThread);
        try {


            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
