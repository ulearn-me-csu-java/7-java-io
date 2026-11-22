package com.example.task02;

import java.io.IOException;

public class Task02Main
{
    public static void main(String[] args) throws IOException
    {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles

        int currentByte = System.in.read();

        while (currentByte != -1)
        {
            if (currentByte == 13)
            {
                int nextByte = System.in.read();

                if (nextByte == 10)
                {
                    // "\r\n" => "\n"
                    System.out.write(10);
                    currentByte = System.in.read();
                }
                else
                {
                    // "\r"
                    System.out.write(13);
                    currentByte = nextByte;
                }
            }
            else
            {
                System.out.write(currentByte);
                currentByte = System.in.read();
            }
        }

        System.out.flush();
    }
}
