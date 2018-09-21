package org.launchcode.k_multithreaded_programming;

public class NewThread2 implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    NewThread2(String name) {
        this.name = name;
        t = new Thread(this, name);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                try {
                    System.out.println(name + " : " + i);
                    Thread.sleep(200);
                    synchronized (this) {
                        while (suspendFlag) {
                            wait();
                        }
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupted");

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }


    synchronized void mySuspend() {
        suspendFlag = true;
    }

   synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

