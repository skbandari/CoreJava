package org.launchcode.k_multithreaded_programming;

class Multiply {

    void fetchResult(int x, int y){
        int result = x*y;
        System.out.print(x + "X" + y + " = ");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(result);
    }
}

class Multiplier implements  Runnable {
    Multiply target = new Multiply();
    int x, y;
    Thread t;

    Multiplier(int x, int y) {
        t = new Thread(this);
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        target.fetchResult(x,y);
    }
}

public class Synch1 {
    public static void main(String[] args) {
        Multiplier m1 = new Multiplier(2,3);
        Multiplier m2 = new Multiplier(3,3);
        Multiplier m3 = new Multiplier(4,3);
        m1.t.start();
        m2.t.start();
        m3.t.start();
    }
}
