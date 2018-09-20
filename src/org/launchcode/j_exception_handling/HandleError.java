package org.launchcode.j_exception_handling;

import java.util.Random;

/**
 * i)  create random numbers a and b
 * ii) divide a/b
 * iii) set c = 12345 and divide by the result obtained in step 2
 * iv) If result in step 2 resolves to be 0, then set c to 0 and continue execution
 */
public class HandleError {
    public static void main(String[] args) {
        int a, b, c;
        c = 1234;
        Random rand = new Random();
        for(int i=0; i<12323; i++) {
            a = rand.nextInt();
            b = rand.nextInt();
            try {
                c = c / (a / b);
            }
            catch(ArithmeticException e) {
                System.out.println("Divide by Zero---> setting c to zero");
                c = 0;
            }
            catch (Exception e){
                System.out.println();
            }
            System.out.println("value of c is " + c);

        }

    }

}
