package com.example.task03;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream must not be null");
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset must not be null");
        }


        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int currentByte;

        while ((currentByte = inputStream.read()) != -1) {
            buffer.write(currentByte);
        }

        return buffer.toString(charset);
    }
}
