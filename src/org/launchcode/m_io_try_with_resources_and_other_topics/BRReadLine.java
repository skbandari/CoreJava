package org.launchcode.m_io_try_with_resources_and_other_topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        do{
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }
}
