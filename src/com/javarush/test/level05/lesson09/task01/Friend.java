package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String Name = null;
    public Friend(String name)
    {
        this.Name = name;
    }
    public Friend (String name,int age)
    {
        this.Name=name+ age;

    }

    public Friend (String name,int age,String gender)
    {
        this.Name= name+age+gender;
    }
}