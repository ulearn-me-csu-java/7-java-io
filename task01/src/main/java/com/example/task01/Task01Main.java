package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream must not be null");
        }
        int checkSum = 0;
        int currentByte;
        while ((currentByte = inputStream.read()) != -1) {
            checkSum = Integer.rotateLeft(checkSum, 1) ^ currentByte;
        }
        return checkSum;
    }
}