package org.launchcode.j_exception_handling;

public class MyException extends Exception {
    private int detail;

    MyException(int detail) {
        this.detail = detail;
    }

    public String toString() {
        return "MyException["+ detail+ "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {

        System.out.println("called compute(" + a + ")");
        if(a >10)
            throw new MyException(a);
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
        } catch (MyException e) {
            System.out.println("caught " + e);
        }
    }
}

