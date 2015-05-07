package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int j=1;
        int i=2;
        int a=3;
        int b =4;
        int c =5;
        int d= 6;
        int e= 7;
        int f =8;
        int g=9;
        int h = 10;
        while(j<=10){
            System.out.println(j+" "+i+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
            j++;
            i=i+2;
            a=a+3;
            b=b+4;
            c=c+5;
            d=d+6;
            e=e+7;
            f=f+8;
            g=g+9;
            h=h+10;

        }

    }
}
