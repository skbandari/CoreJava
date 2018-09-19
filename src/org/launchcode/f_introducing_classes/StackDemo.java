package org.launchcode.f_introducing_classes;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();

        for(int i=0; i<10; i++) {
            st.push(i);
        }



        for(int i=0; i<10; i++) {
            System.out.println(st.pop());
        }
    }
}
