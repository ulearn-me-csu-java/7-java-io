package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles
        final int r = 13;
        final int n = 10;

        boolean isR = false;
        int b;

        while ((b = System.in.read()) != -1) {
            if (isR) {
                if (b == n) {
                    System.out.write(n);
                    isR = false;
                    continue;
                }
                System.out.write(r);
                isR = false;
            }

            if (b == r) {
                isR = true;
            } else {
                System.out.write(b);
            }
        }

        if (isR) {
            System.out.write(r);
        }

        System.out.flush();
    }
}
