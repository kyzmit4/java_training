package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        String i = reader.readLine();
        String k = reader.readLine();


        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int j = Integer.parseInt(i);
        int m = Integer.parseInt(k);

        if (c > d&&c > j&&c > m)

            System.out.println(c);

            else if (d > c && d > j && d > m)

                System.out.println(d);
            else if (j > d && j > c && j > m)
                System.out.println(j);
            else if (m > c && m > j && m > d)
                System.out.println(m);

    }
}