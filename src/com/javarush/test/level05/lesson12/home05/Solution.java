package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int x = 0;

        while (true)
        {
            String n = reader.readLine();

            if (!n.equals("сумма"))
            {
                int a = Integer.parseInt(n);
                x = x + a;

            } else
            {
                System.out.println(x);
                break;
            }
        }
    }
}

