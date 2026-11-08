package com.example.task02;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles
        changeWinToUnixFormat(System.in);
    }

    public static void changeWinToUnixFormat(InputStream inputStream) throws IOException {
        PrintStream outputStream = System.out;
        int cur = inputStream.read();

        while (cur != -1) {
            int next = inputStream.read();
            if (!(cur == 13 & next == 10))
                outputStream.write(cur);
            cur = next;
        }

        outputStream.flush();
    }
}
