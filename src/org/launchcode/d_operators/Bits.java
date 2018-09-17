package org.launchcode.d_operators;

/**
 * Convert a given number to binary
 * Ex: Given a number of 64, the program should print 0100 0000
 */
public class Bits {
    public static void main(String[] args) {

        for (int i = 0; i < 128; i++) {
            System.out.print(i + " ----> ");
            convertToBinary(i);
            System.out.println();
        }
    }

    private static void convertToBinary(int x) {

        long mask = 128L;

        for (int i = 0; i < 8; i++) {
            if ((x & mask) == 0) {
                System.out.print(0);
                System.out.print(" ");
                mask = mask >> 1;
            } else {
                System.out.print(1);
                System.out.print(" ");
                mask = mask >> 1;
            }
        }
    }
}
