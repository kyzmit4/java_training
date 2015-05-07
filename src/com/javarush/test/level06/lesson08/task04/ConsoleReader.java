package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{

    public static String readString() throws Exception
    {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        return n;
    }

    public static int readInt() throws Exception
    {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        int N = Integer.parseInt(m);

        return N;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        String p = reader.readLine();
        double t = Double.parseDouble(p);

        return t;
    }

    public static void readLn() throws Exception

    {
        readString();
    }
    }