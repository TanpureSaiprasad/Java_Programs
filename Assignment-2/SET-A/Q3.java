/*Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method 
Overloading) 
Ans*/

import java.util.*;
class Calculate
{
    void area(float r)
    {
        float a=(float)3.14*r*r;
        System.out.println("Area of Circle:"+a);
    }
    void area(float b,float h)
    {
        float a=(float)0.5*b*h;
        System.out.println("Area of Triangle:"+a);
    }
    void area(int l,int w)
    {
        float a=l*w;
        System.out.println("Area of Rectangle:"+a);
    }

    public static void main(String arg[])
    {
       Calculate ob=new Calculate();
       ob.area(4.5f); 
       ob.area(5,7);
       ob.area(2.5f,3.1f);  
    }
}