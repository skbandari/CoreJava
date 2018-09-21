package org.launchcode.k_multithreaded_programming;

class Call{
   synchronized void calling(String msg) {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print("]");
        System.out.print(" ");
    }
}

class Callof implements Runnable {
    String s;
    Call target;
    Thread t;

    Callof(Call target, String s) {
        this.target = target;
        this.s = s;
        t = new Thread(this);
    }

    @Override
    public void run() {

        synchronized (target) {
            target.calling(s);
            try {
                target.wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Synch3 {
    public static void main(String[] args) {
        Call ob1 = new Call();

        Callof t1 = new Callof(ob1,"Hello");
        Callof t2 = new Callof(ob1,"World");
        Callof t3 = new Callof(ob1,"Message");
        t1.t.start();
        t2.t.start();
        t3.t.start();

    }
}
