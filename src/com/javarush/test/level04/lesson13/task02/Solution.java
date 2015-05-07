package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String m = reader.readLine();
        int N = Integer.parseInt(n);
        int M = Integer.parseInt(m);
        int C = M;
        C = 8;
        {
            for (int p = N; p > 0; p--)
            {
                for (int d = M; d > 0; d--)
                {
                    System.out.print(C);
                }
                System.out.println();
                
            }
        }
    }
}


