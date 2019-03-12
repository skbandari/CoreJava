package org.launchcode.f_introducing_classes;

public class Stack {
    int stack[] = new int[10];
    int position = -1;


    void push(int x) {
        if (position == 9) {
            System.out.println("Stack is full");
        } else {
            System.out.println("pushed item--->" + x);
            stack[++position] = x;
        }
    }

    int pop() {
        if (position == -1) {
            System.out.println("stack is empty");
            return 0;
        } else {
            System.out.println("pop'ing item -->" + stack[position]);
            return stack[position--];
        }
    }
}

