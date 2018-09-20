package org.launchcode.j_exception_handling;

class Throw {
    static void demoProc() {
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (ArithmeticException e) {
            System.out.println("thrown");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}

public class ThrowDemo {
    public static void main(String[] args) {
        try {Throw.demoProc();}
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }

}
