package org.launchcode.j_exception_handling;

public class Exc0 {
    public static void main(String[] args) {
        int d = 24;
        int f = 0;
        try {
            System.out.println(d / f);
        }
        catch (Exception e){
            System.out.println(e);
        }
        catch (Throwable e){
            System.out.println();
        }
        finally {
            System.out.println("finally");
        }
    }
}
