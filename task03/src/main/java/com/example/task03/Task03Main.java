package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println(readAsString(new FileInputStream("task03/src/test/resources/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException
    {
        if (inputStream == null)
        {
            throw new IllegalArgumentException("inputStream is null");
        }

        if (charset == null)
        {
            throw new IllegalArgumentException("charset is null");
        }

        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();
        char[] buffer = new char[1024];
        int count;

        while ((count = reader.read(buffer)) != -1)
        {
            result.append(buffer, 0, count);
        }

        return result.toString();
    }
}
