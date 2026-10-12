package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        boolean flag = false;
        int b;
        while ((b = System.in.read()) != -1) {
            if (flag) {
                if (b == 10) {
                    System.out.write(10);
                    flag = false;
                    continue;
                }
                System.out.write(13);
                flag = false;
            }
            if (b == 13) {
                flag = true;
            } else {
                System.out.write(b);
            }
        }
        if (flag) {
            System.out.write(13);
        }
        System.out.flush();
    }
}
