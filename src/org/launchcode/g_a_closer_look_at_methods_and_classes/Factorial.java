package org.launchcode.g_a_closer_look_at_methods_and_classes;

class Test4 {
    int i;

    Test4(int i) {
        this.i = i;
    }

    int factorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }

}

public class Factorial {
    public static void main(String[] args) {
        Test4 ob = new Test4(11);
        System.out.println(ob.factorial(10));
    }
}
