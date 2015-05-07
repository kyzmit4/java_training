package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int pramoug =0;
    public Rectangle(int left,int top,int width,int height)
    {
        this.pramoug=left+top+width+height;
    }
    private int width1 =0;
    private int height1 = 0;
    public Rectangle(int left,int top)
    {
        this.pramoug=left+ top+width1+height1;
    }
    private int width2 = 0;
    public Rectangle(int top,int left,int width2)
    {
this.width2=height1;
        this.pramoug=top+left+width2+height1;
    }
    private int top;
    private int left;
    public Rectangle()
    {
        this.pramoug=left+top+width1+height1;
    }

}
