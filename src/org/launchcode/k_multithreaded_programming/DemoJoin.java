package org.launchcode.k_multithreaded_programming;

class MultThreads implements Runnable {


    String name;
    Thread t;

    MultThreads(String name) {
        t = new Thread(this,name);
        System.out.println("Child Thread Created : " + t);
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("THREE"))
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for(int i=0; i<5; i++) {
            try{
                Thread.sleep(1500);
                System.out.println(t + "child Thread count" + i);
            } catch (InterruptedException exc) {
                System.out.println("Exception thrown" + exc);
            }
        }
        System.out.println(t + "Child Thread exiting");

    }
}

public class DemoJoin {
    public static void main(String[] args) {
        final String ONE = "ONE";
        final String TWO = "TWO";
        final String THREE = "THREE";
        ThreeThreads t1 = new ThreeThreads(ONE);
        ThreeThreads t2 = new ThreeThreads(TWO);
        ThreeThreads t3 = new ThreeThreads(THREE);
        t1.t.start();
        t2.t.start();
        t3.t.start();

        for (int j=5; j>0; j--) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Main thread Count :" + j);

                t1.t.join();
                t2.t.join();
                t3.t.join();


            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }

        System.out.println(t1.t.getState());
        System.out.println("Main thread Exiting");
        System.out.println(Thread.currentThread().getState());

    }
}
