
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
                sum += Double.parseDouble(token);
            } catch (NumberFormatException e) {
                // Если часть текста не является числом, пропускаем её
            }
        }

        System.out.printf(Locale.US, "%.6f%n", sum);
    }
}