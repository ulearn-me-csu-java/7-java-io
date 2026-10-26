package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        String line;

        while ((line = reader.readLine()) != null) {

            String[] tokens = line.trim().split("\\s+");

            for (String token : tokens) {
                if (token.isEmpty()) {
                    continue;
                }

                try {
                    double number = Double.parseDouble(token);
                    sum += number;
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.printf(java.util.Locale.US, "%.6f%n", sum);
    }
}