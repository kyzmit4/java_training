package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name = null;
    public void initialize(String name)
    {
        this.name =name;
    }
public void initialize(int age,String name)
{
    this.name = age+name;

}
    public void initialize(String gender,int age,String name)
    {
        this.name = gender+age+name;

    }

}

