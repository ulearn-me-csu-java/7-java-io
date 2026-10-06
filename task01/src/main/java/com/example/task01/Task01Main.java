package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        if (inputStream == null){
            throw new IllegalArgumentException("InputStream cannot be null");
        }
        int checksum = 0;
        int data;

        if (inputStream.equals(new ByteArrayInputStream(new byte[0]))) {
            return 0;
        } else {
            while ((data = inputStream.read()) != -1) {

                int rotated = Integer.rotateLeft(checksum, 1);

                int unByte = data & 0xFF;

                checksum = rotated ^ unByte;
            }
            return checksum;
        }
    }
}
