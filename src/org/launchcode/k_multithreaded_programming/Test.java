package org.launchcode.k_multithreaded_programming;

public class Test {

    public static void main(String[] args){
        InterruptedException e = new InterruptedException();

        try{
            throw e;
        } catch(InterruptedException ec) {
            System.out.println(ec);
        }
    }
}
