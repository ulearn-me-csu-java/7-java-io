package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream must not be null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("Charset must not be null");
        }

        InputStreamReader reader = new InputStreamReader(inputStream, charset);

        StringBuilder result = new StringBuilder();

        int currentChar;
        while ((currentChar = reader.read()) != -1) {
            result.append((char) currentChar);
        }

        return result.toString();
    }
}