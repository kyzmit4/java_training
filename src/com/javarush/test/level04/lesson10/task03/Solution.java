package com.javarush.test.level04.lesson10.task03;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xpath.internal.operations.NotEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String abc = buffer.readLine();
        String N = buffer.readLine();
        int M = Integer.parseInt(N);
        int i=0;


            while (i<M){
                System.out.println(abc);
            i++;

        }
        }
    }







