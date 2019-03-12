package org.launchcode.c_data_types_variables_and_arrays;

public class ScopeTest {


    public static void main(String[] args) {

        int t = 10;

        int x = t++;

        int y = ++t;

        if( (t<0) & (x/y >0)   ){
            System.out.println("Test passed");
        }

        System.out.println(t);
        System.out.println(x);
        System.out.println(y);

    }
}
