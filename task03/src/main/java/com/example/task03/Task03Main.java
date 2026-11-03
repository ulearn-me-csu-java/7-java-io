package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));
        */
        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        if (inputStream == null || charset == null) {
            throw new IllegalArgumentException("InputStream and Charset must not be null");
        }
        StringBuilder result = new StringBuilder();
        Reader reader = new InputStreamReader(inputStream, charset);

        int ch;
        while ((ch = reader.read()) != -1) {
            result.append((char) ch);
        }

        return result.toString();
    }
}
