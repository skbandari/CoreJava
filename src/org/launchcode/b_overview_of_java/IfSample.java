package org.launchcode.b_overview_of_java;

public class IfSample {
    public static void main(String[] args) {
        int x,y;
         x = 10;
         y = 20;

         if (x < y) {
             System.out.println("value of x and y are : " + x + " "+ y+  " x is less than y");
         }

         x = x*2;

         if (x == y) {
             System.out.println("value of x and y are : " + x + " "+ y+  " x is equal to y");
         }

         x = x*2;

         if (x == y) {
             System.out.println("x is equal to y");
         } else {
             System.out.println("x is not equal to y");
         }

    }
}
