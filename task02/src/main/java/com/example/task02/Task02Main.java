package com.example.task02;

import java.io.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream in = new BufferedInputStream(System.in);
        OutputStream out = new BufferedOutputStream(System.out);

        int prev = in.read();
        while (prev != -1) {
            int next = in.read();
            if (prev == 13 && next == 10) {
                out.write(10);
                prev = in.read();
            } else {
                out.write(prev);
                prev = next;
            }
        }
        out.flush();
    }
}
