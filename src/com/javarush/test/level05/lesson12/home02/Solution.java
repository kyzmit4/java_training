package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {

String name = "Vasa";
        int age= 3;
        String address = "mira 7";
        System.out.println(name + " " + age + " " + address);

        String name1 = "goga";
        int age1=4;
        String address1="sebb 4";
        System.out.println(name1 + " " + age1 + " " + address1);

         // Создай по два объекта каждого класса тут

        // Выведи их на экран тут
    }

    public static class Man
    {
        private String name =null;
        private int age =0;
        private String address = null;



        public Man(String name,int age,String address)
        {


        }
        }


    public static class Woman
    {
        private String name =null;
        private int age =0;
        private String address = null;

        public Woman (String name,String adress, int age)
        {
            this.name="kaytya";
            this.age=23;

        }

    }

}

