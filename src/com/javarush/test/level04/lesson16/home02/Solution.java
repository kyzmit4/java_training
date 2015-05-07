package com.javarush.test.level04.lesson16.home02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String m = reader.readLine();
        String c = reader.readLine();
        int N = Integer.parseInt(n);
        int M = Integer.parseInt(m);
        int C = Integer.parseInt(c);

        if (M>N&&C>M)
        System.out.println(M);

        if (M>C&&C>N)
            System.out.println(C);
        if (C>N&&M<N)
            System.out.println(N);
        if (M>N&&N>C)
            System.out.println(N);

            if (N > C && M < C)
                System.out.println(C);

                if (N > M && M > C)
                    System.out.println(M);





    }
}
