package org.launchcode.e_control_statements;

import java.io.IOException;

public class Menu {
    public static void main(String[] args)
        throws IOException {
        char choice;

        do{
            System.out.println("Help on");
            System.out.println(" 1. If");
            System.out.println(" 2. Switch");
            System.out.println(" 3. While");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Choose one");
            choice = (char)System.in.read();

        } while (choice < '1' || choice > 5);

    }
}
