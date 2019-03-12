package org.launchcode.m_io_try_with_resources_and_other_topics;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw  = new PrintWriter(System.out, true);
        pw.println("test");
    }
}
