package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double result = 0;

        Reader reader = new InputStreamReader(System.in);
        Scanner scanner = new Scanner(reader);
        //a1 b2 c3
        while (scanner.hasNext()) {
            try {
                double x = Double.parseDouble(scanner.next());
                result += x;
            } catch (NumberFormatException e) {
                System.err.println("Символ не является числом");
            }
        }

        String res = String.format(Locale.US, "%.6f", result);
        System.out.println(res);


//        System.out.println("0.0");
    }
}
