package org.launchcode.f_introducing_classes;

public class Queue {

    int[] q ;
    int putloc, getloc;

    Queue(int size) {
        q = new int[size];
        putloc = getloc = 0;
    }

    void put(int x) {
        if(putloc == q.length) {
            System.out.println("No space in the Queue !");
        } else {
            q[putloc++] = x;
            System.out.println(x + " --> added to the Queue");
        }
    }

    int get() {
        if(getloc == q.length) {
            System.out.print("Nothing to return  --");
            return 0;
        } else {
            System.out.print("Retrieving from Queue-->");
            return q[getloc++];

        }
    }

}


