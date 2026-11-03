
package com.example.task02;

import java.io.IOException;

public class Task02Main {
    // чтобы протестировать свое решение, вам нужно:
    // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
    // - направить стандартный вывод программы в файл output.test
    // - запустить программу
    // - и сравнить получившийся файл output.test с src/test/resources/expected.test
    // то же самое делает тест main_testFiles
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();

        if (prev != -1) {
            int curr;
            while ((curr = System.in.read()) != -1) {
                if (prev != 13 || curr != 10) {
                    System.out.write(prev);
                }
                prev = curr;
            }
            System.out.write(prev);
        }

        System.out.flush();
    }
}
