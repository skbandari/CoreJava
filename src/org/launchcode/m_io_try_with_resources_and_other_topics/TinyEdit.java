package org.launchcode.m_io_try_with_resources_and_other_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a class to demonstrate Tiny Editor using I/O Character Streams. The class should do following:
 * i)   Read lines of String's from the console and save them into an array
 * ii)  once all the lines are read , the console should output what the user has inputted
 */

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        String s;

        System.out.println("Enter lines");
        int i;
        for( i=0; i<str.length; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop"))
                break;
        }
        System.out.println("YOUR FILE");
        for(int j=0; j<=i; j++ )
            System.out.println(str[j]);



    }
}
