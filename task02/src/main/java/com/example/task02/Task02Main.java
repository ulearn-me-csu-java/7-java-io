package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousByte = -1; // Храним предыдущий байт
        int currentByte;

        while ((currentByte = System.in.read()) != -1) {
            if (previousByte == 13) {
                if (currentByte == 10) {
                    System.out.write(10);
                    previousByte = -1;
                    continue;
                } else {
                    System.out.write(13);
                }
            } else if (previousByte != -1) {
                System.out.write(previousByte);
            }

            previousByte = currentByte;
        }

        if (previousByte != -1) {
            System.out.write(previousByte);
        }


        System.out.flush();
    }
}