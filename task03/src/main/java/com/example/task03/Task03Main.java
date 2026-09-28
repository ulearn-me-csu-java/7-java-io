package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException();
        }

        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[1024];
        int count;
        while ((count = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, count);
        }
        return sb.toString();
    }
}
