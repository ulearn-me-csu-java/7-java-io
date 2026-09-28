package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException("inputStream and charset must not be null");
        }

        StringBuilder result = new StringBuilder();

        try (Reader reader = new InputStreamReader(inputStream, charset)) {
            int c;
            while ((c = reader.read()) != -1) {
                result.append((char) c);
            }
        }
        return result.toString();
    }
}
