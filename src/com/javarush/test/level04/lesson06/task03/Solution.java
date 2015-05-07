package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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


        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int j = Integer.parseInt(i);

        {
            if (c > d && c > j)

                System.out.println(c+" "+d+" "+j);
            else if (d > c && j > d)
                System.out.println(j+" "+d+" " + c);
            else if (c > j &&c >d)
                System.out.println(c+" "+j+" " + d);
            else if (d > c && c > j)
                System.out.println(d+" "+c+" " + j);
            else if (d > c && j > c)
                System.out.println(d+" "+j+" " + c);
            else if (c > d && j > c)
                System.out.println(j+" "+c+" " + d);

        }
    }
}
