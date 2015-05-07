package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,"mama");
        list.add(1,"mila");
        list.add(2,"ramu");
        list.add(3,"kaka");
        list.add(4,"vanyaboss");
        System.out.println(list.size());

        for(int i = 0;i<list.size();i++)
        {
            int j = list.size()-i-1;
            System.out.println(list.get(j));
        }

    }
}
