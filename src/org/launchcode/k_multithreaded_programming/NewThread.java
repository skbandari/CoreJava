package org.launchcode.k_multithreaded_programming;

/**
 * This is a practise class to implement Runnable Interface. This does following :
 * i)   Implements Runnable Interface
 * ii)  Create Two threads : Child Thread and Main thread(ie..main method)
 * iii) Using system out, demonstrate that child thread runs and ends before Main Thread
 */
public class NewThread implements Runnable {

    Thread t;

    NewThread() {
        t = new Thread(this,"Child");
        System.out.println("Child Thread Created");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Child Thread -> " + i);
                if(i==4)
                    Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Interrupted");

            }
        }
        System.out.println("child thread exiting");
    }

    public static void main(String[] args) {

        NewThread nt = new NewThread();
        nt.t.run();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Main Thread " + i);
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted");

            }
        }
        System.out.println("Main Thread exiting");
    }
}
