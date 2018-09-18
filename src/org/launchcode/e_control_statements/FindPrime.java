package org.launchcode.e_control_statements;

public class FindPrime {
    public static void main(String[] args) {
        int num = 7;

        boolean isPrime = false;

        isPrime =  (num <2) ? false:true;

        for(int i =2; i < num ; i++) {
            if ((num%i) == 0 ) {
                isPrime = false;
            }
        }



        System.out.println(num + " is isPrime -->"+  isPrime);


    }
}
