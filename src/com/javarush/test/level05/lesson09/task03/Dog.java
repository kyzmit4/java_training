package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String Name = null;
    public Dog(String name)
    {
        this.Name = name;
    }
    public Dog(String name,int height)
    {
        this.Name =name+height;
    }
    public Dog (String name,int height, String color)
    {
        this.Name = name+height+color;
    }

}
