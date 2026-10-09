package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int current;
        boolean previousWasCR = false;

        while ((current = System.in.read()) != -1) {
            if (previousWasCR) {
                if (current == '\n') {
                    System.out.write('\n');
                    previousWasCR = false;
                    continue;
                } else {
                    System.out.write('\r');
                    previousWasCR = false;
                }
            }

            if (current == '\r') {
                previousWasCR = true;
            } else {
                System.out.write(current);
            }
        }

        if (previousWasCR) {
            System.out.write('\r');
        }

        System.out.flush();
    }
}