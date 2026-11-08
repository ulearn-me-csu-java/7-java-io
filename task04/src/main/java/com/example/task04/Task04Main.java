package com.example.task04;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        printSum(new Scanner(System.in));
    }

    public static void printSum(Scanner sc) {
        double sum = 0;
        while (sc.hasNext()) {
            try {
                sum += Double.parseDouble(sc.next());
            } catch (Exception e) {
            }
        }
        System.out.printf(Locale.US,"%.6f", sum);
    }
}
