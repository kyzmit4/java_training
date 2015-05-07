package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name = null;
    public int StandartWeight = 10;
    public void initialize(String name)
    {
        this.name =name;
    }
    public void initialize(String name,int weight,int age)
    {
        this.name = name+weight+age;
    }
    public void initialize(String name,int age)
    {
        this.name = name + age+StandartWeight;
    }
    private String name1 = null;
    private String adress = null;
    private int age = 0;
    public void initialize(int weight,String color,String name1)
    {
       this.name= weight+color+name1+adress+age;
    }
    public void initialize(int weight,String color)
    {
        this.name = weight+color+adress;
    }
    }
