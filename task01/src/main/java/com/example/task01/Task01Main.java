package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if (inputStream == null) throw new IllegalArgumentException();

        List<Integer> bytes = new ArrayList<Integer>();

        int b;
        while ((b = inputStream.read()) != -1) {
            bytes.add(b);
        }

        return calculateCheckSum(bytes, bytes.size() - 1);
    }

    private static int calculateCheckSum(List<Integer> bytes, int n) {
        if (n < 0)
            return 0;

        return Integer.rotateLeft(calculateCheckSum(bytes, n - 1), 1) ^ bytes.get(n);
    }
}
