package com.example.task04;

import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;

        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                double number = Double.parseDouble(token);
                sum += number;
            } catch (NumberFormatException e) {
            }
        }
        System.out.printf(Locale.US, "%.6f\n", sum);
    }
}
