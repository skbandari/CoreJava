package org.launchcode.e_control_statements;

public class EnhancedFor {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        for (int x : array) {

            if(x ==3) {
                continue;
            }

            System.out.print(x);
        }
    }



}
