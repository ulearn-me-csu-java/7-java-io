package com.example.task02;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles

        int prev = -1;
        int b;
        while ((b = System.in.read()) != -1) {
            if (prev == 13 && b == 10) {
                System.out.write(10);
                prev = -1;
            } else {
                if (prev != -1) {
                    System.out.write(prev);
                }
                prev = b;
            }
        }
        if (prev != -1) {
            System.out.write(prev);
        }
        System.out.flush();
    }
}
