package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                sum += Double.parseDouble(token);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf(Locale.ROOT, "%.6f", sum);
    }
}
