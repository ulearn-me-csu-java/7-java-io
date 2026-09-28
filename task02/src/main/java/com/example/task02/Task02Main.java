package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        while (prev != -1) {
            int next = System.in.read();
            if (prev == 13 && next == 10) {
                prev = next;
            } else {
                System.out.write(prev);
                prev = next;
            }
        }
        System.out.flush();
    }
}
