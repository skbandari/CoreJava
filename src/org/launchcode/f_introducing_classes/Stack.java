package org.launchcode.f_introducing_classes;

public class Stack {
    int stack[] = new int[10];
    int tos = -1;

    void push(int x) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = x;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

