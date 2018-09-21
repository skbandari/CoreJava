package org.launchcode.k_multithreaded_programming;

class NewThread3 implements Runnable {

    Thread t;
    String s;
    //factory Method to create a thread object

    NewThread3(String s) {
        this.s = s;
        t  = new Thread(this, s);
    }

    public  static NewThread3 NewThread3Of(String string){
        NewThread3 t = new NewThread3(string);
        t.t.start();
        return t;
    }

    @Override
    public void run() {
        System.out.println("Thread Started");
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NewThread3.NewThread3Of("New Thread");
    }
}
