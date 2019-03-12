package org.launchcode.f_introducing_classes;

public class QDemo {
    public static void main(String[] args) {
        Queue q = new Queue(10);

        for(int i=0; i<10; i++) {
            q.put(i);
        }

        //This should return error
            q.put(11);

        for(int i=0; i<10; i++) {
            q.get();
        }

        //this should return error
            q.get();
    }
}
