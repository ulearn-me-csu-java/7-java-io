package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int currentByte;
        boolean prevWasCR = false;

        // Читаем поток пока не вернется -1
        while ((currentByte = System.in.read()) != -1) {
            
            if (prevWasCR) {
                // Предыдущий был \r
                if (currentByte == 10) { // Текущий \n
                    // Это пара \r\n, выводим только \n
                    System.out.write(10);
                    prevWasCR = false;
                } else {
                    // Предыдущий \r оказался одиночным, выводим его как есть
                    System.out.write(13);
                    prevWasCR = false;
                    
                    // Обрабатываем текущий байт
                    if (currentByte == 13) {
                        prevWasCR = true;
                    } else {
                        System.out.write(currentByte);
                    }
                }
            } else {
                if (currentByte == 13) {
                    prevWasCR = true;
                } else {
                    System.out.write(currentByte);
                }
            }
        }
        if (prevWasCR) {
            System.out.write(13);
        }
        System.out.flush();
    }
}
