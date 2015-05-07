package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX,centerY,radius,width;
    private String color;
    private int center1 = 0;
    public void initialize(int centerX,int centerY,int radius)
    {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.center1=centerX+centerY+radius;
    }
    private int center2=0;
    public void initialize(int centerX,int centerY,int radius,int width)
    {
        this.centerX = centerX;
        this.centerY= centerY;
        this.radius = radius;
        this.width= width;
        this.center2=centerX+centerY+radius+width;
    }
    private int center3= 0;
    public void initialize(int centerX,int centerY,int radius,int width,String color)
    {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;


    }
}
