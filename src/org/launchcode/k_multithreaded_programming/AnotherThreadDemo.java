package org.launchcode.k_multithreaded_programming;

public class AnotherThreadDemo extends Thread {

//    Thread t;


    AnotherThreadDemo() {
        super("Child Thread");
        System.out.println(this);
    }

    //When the Child thread starts following method is called
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            try{
                Thread.sleep(5000);
                System.out.println("child thread " + i);
            } catch(InterruptedException e) {
                System.out.println("child thread interrupted");
            }
        }
        System.out.println("child thread exiting");
    }

    public static void main(String[] args) {
        AnotherThreadDemo anotherThread = new AnotherThreadDemo();
//        anotherThread.t.start();
        anotherThread.start();

        for(int j=0; j<5; j++) {
            try{
                Thread.sleep(1000);
                System.out.println("Main thread " + j);
            } catch(InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }

        }
        System.out.println("Main thread exiting");
    }
}
