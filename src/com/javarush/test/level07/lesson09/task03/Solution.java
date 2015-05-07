package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String>list=new ArrayList<String>();
        Collections.addAll(list,"мама");

        ArrayList<String>list0=new ArrayList<String>();
        Collections.addAll(list0,"мыла");

        ArrayList<String>list1=new ArrayList<String>();
        Collections.addAll(list1,"раму");

        ArrayList<String>list2=new ArrayList<String>();
        Collections.addAll(list2,"именно");

        ArrayList<String>result=new ArrayList<String>();

            result.addAll(list);
            result.addAll(list2);
            result.addAll(list0);
            result.addAll(list2);
            result.addAll(list1);
            result.addAll(list2);


        for(String x  :  result)
        {
            System.out.println(x);
        }
    }
}
