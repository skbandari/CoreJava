package org.launchcode.m_io_try_with_resources_and_other_topics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ShowFile {
    public static void main(String[] args) {
        FileInputStream fin ;
        int i;

        //Open the file
        try{
            fin = new FileInputStream("C:\\Users\\Krish\\Desktop\\Java\\random\\Suspend.java");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open the file");
            return;
        }

        //Read the file
        try{
            do{
                i = fin.read();
                System.out.print((char)i);
            }while(i!=-1);

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        finally {
            //Close the file
            try{
                fin.close();
            } catch (Exception e) {
                System.out.println("Cannot close the file");
            }
        }


    }
}
