package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String Name = null;
    public Cat(String name)
    {
        this.Name=name;
    }
public Cat(String name,int weight,int age)
{
    this.Name= name+weight+age;
}
    private int weight1=4;
    public Cat(String name,int age)
    {
        this.Name= name+age+weight1;
    }
    private String name1 =null;
    private String adress = null;
    private int age = 0;
    public Cat(int weight,String color)
    {
        this.Name= name1+adress+age+weight+color;
    }
    public Cat (int weight,String color,String adress)
    {
        this.Name = weight+color+adress;
    }
}

