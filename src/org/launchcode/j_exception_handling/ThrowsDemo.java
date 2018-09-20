package org.launchcode.j_exception_handling;

public class ThrowsDemo {
   static void throwIllegalAccessExc()  {
       throw new ArithmeticException();
    }

    public static void main(String[] args) {
        try{
            throwIllegalAccessExc();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
