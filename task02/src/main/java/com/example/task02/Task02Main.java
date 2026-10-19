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
        int preByte = -1;
        int currentByte;

        while ((currentByte = System.in.read()) != -1) {
            //preByte = currentByte;
            if (currentByte == 10 && preByte == 13) {
                System.out.write(currentByte);
                preByte = -1;
            } else if (preByte != -1) {
                System.out.write(preByte);
                preByte = currentByte;
            } else {
                preByte = currentByte;
            }

        } // -1 65 13 10 10 10 13 pre = 65 cur = 13
        if (preByte != -1) {
            System.out.write(preByte);
        }
        System.out.flush();
    }
}
