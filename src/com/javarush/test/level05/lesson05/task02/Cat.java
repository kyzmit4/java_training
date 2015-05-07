package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;


    public Cat()
    {
    }

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "Vaska";
        cat2.name = "Jora";
        cat1.age = 3;
        cat2.age = 4;
        cat1.strength = 5;
        cat2.strength = 6;
        System.out.println(cat1.fight(cat2));
    }

    public boolean fight(Cat anotherCat)
    {
        if (this.age > anotherCat.age)
        {
            return true;
        } else
        {
            return false;
        }

    }
}
