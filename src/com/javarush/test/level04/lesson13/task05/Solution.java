package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Итерация " + i + ": ");
            for (int j = 0; j < 10; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен.");
    }
}
