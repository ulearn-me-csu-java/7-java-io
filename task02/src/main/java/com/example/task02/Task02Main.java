package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = -1;
        int cur;
        while ((cur = System.in.read()) != -1) {
            if (prev == 13) {
                if (cur == 10) {
                    // пара \r\n -> один \n
                    System.out.write(10);
                    prev = -1;
                    continue;
                }
                // одиночный \r выводим как есть
                System.out.write(13);
            }
            if (cur == 13) {
                // откладываем, пока не узнаем следующий байт
                prev = 13;
            } else {
                System.out.write(cur);
                prev = -1;
            }
        }
        if (prev == 13) {
            System.out.write(13);
        }
        System.out.flush();
    }
}