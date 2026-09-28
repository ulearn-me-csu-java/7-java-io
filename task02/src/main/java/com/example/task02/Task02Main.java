package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int currentByte;
        boolean previousWasCR = false;

        while ((currentByte = System.in.read()) != -1) {
            if (currentByte == '\n') {
                // пара "\r\n" - значит один '\n'.
                // если '\r' не было - значит просто '\n'.
                System.out.write('\n');
                previousWasCR = false;
            } else if (currentByte == '\r') {
                if (previousWasCR) {
                    System.out.write('\r');
                }
                // запоминаем текущий '\r' а потом ждём следующего байта
                previousWasCR = true;
            } else {
                // обычный байт.
                // если перед ним был '\r' — значит одиночный, выводим.
                if (previousWasCR) {
                    System.out.write('\r');
                    previousWasCR = false;
                }
                System.out.write(currentByte);
            }
        }

        // Если поток закончился, а последний байт был '\r' — он одиночный, выводим.
        if (previousWasCR) {
            System.out.write('\r');
        }

        System.out.flush();
    }
}
