package org.launchcode.k_multithreaded_programming;

import org.launchcode.i_packages_and_interfaces.p1.Protection;

/**
 * Create a class that puts items into Q and simultaneously retrieves them using MultiThreading
 */

class Q {
    int i;
    boolean valueSet =false;

    synchronized void put(int i) {
        while(valueSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.i = i;
        valueSet = true;
        System.out.println("Put " + i);
        notify();
    }

    synchronized void get() {
        while(!valueSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Get " + i);
        valueSet=false;
        notify();

    }
}

class Producer implements Runnable {
    Q target ;
    Thread t;

    Producer(Q targ) {
        this.target = targ;
        t = new Thread(this);
    }

    @Override
    public void run() {
        int i = 0;
        while(i<100) {
            target.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q targ ;
    Thread t;

    Consumer(Q targ) {
        this.targ = targ;
        t = new Thread(this);

    }

    @Override
    public void run() {
        int i=90;
        while(i>0){
            targ.get();
            i--;
        }

    }
}

public class PC {
    public static void main(String[] args) {

        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();
        System.out.println("Press Ctrl_C to stop");

    }
}
