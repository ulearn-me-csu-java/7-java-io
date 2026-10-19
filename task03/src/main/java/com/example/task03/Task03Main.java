package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here

        //Reader reader = new InputStreamReader(inputStream, charset);
        if (inputStream == null) throw new IllegalArgumentException();
        if (charset == null) throw new IllegalArgumentException();

        return new String(inputStream.readAllBytes(), charset);

    }
}

/*

   Reader reader = new InputStreamReader(input, charset);

        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[8192];

        int n;
        while ((n = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, n);
        }

        String text = sb.toString();
 */