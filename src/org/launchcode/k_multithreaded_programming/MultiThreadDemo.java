package org.launchcode.k_multithreaded_programming;

/**
 * This is a test class which performs following :
 * i)  Create three threads apart from the main thread
 * ii) Demonstrate that all the threads can run parallel manner
 */
class ThreeThreads implements Runnable {

    String name;
    Thread t;

    ThreeThreads(String name) {
        t = new Thread(this, name);
        System.out.println("Child Thread Created --> " + name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("child Thread->" + Thread.currentThread().getName() + ":  count = " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Child Thread " + Thread.currentThread().getName() + " Exiting");
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {

        ThreeThreads threeThreads1 = new ThreeThreads("ONE");
        ThreeThreads threeThreads2 = new ThreeThreads("TWO");
        ThreeThreads threeThreads3 = new ThreeThreads("THREE");
        threeThreads1.t.start();
        threeThreads2.t.start();
        threeThreads3.t.start();

        for (int j=0; j<5; j++ ) {
            try{
                Thread.sleep(1000);
                System.out.println("Main Thread Count = " + j);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Main thread Exiting");

    }
}
