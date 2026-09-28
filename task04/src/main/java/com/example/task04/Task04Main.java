package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        String line;

        while ((line = reader.readLine()) != null) {
            // разбиваем строку по любым пробельным символам
            String[] tokens = line.split("\\s+");

            for (String token : tokens) {
                if (token.isEmpty()) {
                    continue;
                }

                try {
                    sum += Double.parseDouble(token);
                } catch (NumberFormatException e) {
                    // токен не является числом, пропускаем
                }
            }
        }

        // форматируем с точностью до 6 знаков после запятой
        System.out.printf(Locale.US, "%.6f%n", sum);
    }
}
