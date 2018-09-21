package org.launchcode.k_multithreaded_programming;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread2 t1 = new NewThread2("One");
        NewThread2 t2 = new NewThread2("Two");

        t1.t.start();
        t2.t.start();

        try{
            Thread.sleep(1000);
            t1.mySuspend();
            System.out.println("suspending Thread 1");
            Thread.sleep(1000);
            t1.myResume();
            System.out.println("Resuming Thread 1");
            t2.mySuspend();
            System.out.println("suspending Thread 2");
            t2.myResume();
            System.out.println("Resuming Thread 2");

        } catch(InterruptedException e) {
            System.out.println(e);
        }

        try{
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main thread ending");

    }
}
