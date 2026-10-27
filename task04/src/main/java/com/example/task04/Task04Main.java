package com.example.task04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        String input = new String(System.in.readAllBytes(), StandardCharsets.UTF_8);

        double sum = 0.0;
        for (String token : input.split("\\s+")) {
            if (token.isEmpty()) continue;
            try {
                sum += Double.parseDouble(token);
            } catch (NumberFormatException ignored) {
                }
        }

        System.out.print(String.format(Locale.US, "%.6f", sum));
    }
}

