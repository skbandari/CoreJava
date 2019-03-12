package org.launchcode.m_io_try_with_resources_and_other_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, q to quit");

        char ch;
        char[] q = new char[10];
        do{
            ch = (char) br.read();

            System.out.println(ch);
        }while(ch != 'q');
    }
}
