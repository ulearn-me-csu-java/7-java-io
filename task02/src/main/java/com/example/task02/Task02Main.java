package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        boolean pendingCr = false;

        int b;
        while ((b = System.in.read()) != -1){
            if (pendingCr){
                if (b == 10){
                    System.out.write(10);
                    pendingCr = false;
                    continue;
                } else {
                    System.out.write(13);
                    pendingCr = false;
                }
            }
            if (b == 13){
                pendingCr = true;
            } else {
                System.out.write(b);
            }
        }
        if (pendingCr){
            System.out.write(13);
        }
        System.out.flush();
    }
}
