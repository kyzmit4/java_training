package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
   private int kolo=0;
    public Circle(int centerX,int centerY,int radius)
    {
        this.kolo=centerX+centerY+radius;
    }
    public Circle(int centerX,int centerY,int radius,int width)
    {
        this.kolo=centerX+centerY+radius+width;
    }

    public Circle(int centerX,int centerY,int radius,int width,int color)
    {
        this.kolo=centerX+centerY+radius+width+color;
    }
}
