package org.launchcode.m_io_try_with_resources_and_other_topics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        int i;

        try{
            fin = new FileInputStream("C:\\Users\\Krish\\Desktop\\Java\\random\\Suspend.java");
            fout = new FileOutputStream("C:\\Users\\Krish\\Desktop\\test.txt");
        } catch (Exception e) {
            System.out.println("cannot open file");
            return;
        }

        try{
            do{
                i = fin.read();
                fout.write(i);
            }while(i != -1 );
        } catch (Exception e) {
            System.out.println("error copying files");
        }
        finally{
            try{
                fin.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            try{
                fout.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
