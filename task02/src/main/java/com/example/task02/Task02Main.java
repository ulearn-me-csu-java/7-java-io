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
        int before = -1;
        int now;

        while((now = System.in.read()) != -1) {

            if (before == 13 && now != 10){
                System.out.write(before);
            }

            if (now != 13){
                System.out.write(now);
            }
            before = now;
        }

        if (before == 13){
            System.out.write(13);
        }

        System.out.flush();
    }
}
