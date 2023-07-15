/*
1. Create an abstract class Shape with methods calc_area() & calc_volume(). Derive two 
classes Sphere(radius)& Cone(radius, height) from it. Calculate area and volume of both. 
(Use Method Overriding) 
Ans=>*/

import java.util.*;
abstract class Shape
{
    Scanner sc=new Scanner(System.in);
    abstract void area();
    abstract void volume();
}
class Sphere extends Shape
{
    float r;
    Sphere()
    {
        System.out.println("Enter Radius of Sphere:");
        r=sc.nextFloat();
    }
    void area()
    {
        float a=4*3.14f*r*r;
        System.out.println("Area of Sphere:"+a);
    }
    void volume()
    {
        float v=(4/3)*3.14f*r*r*r;
        System.out.println("Volume of Sphere:"+v);
    }
}
class Cone extends Shape
{
    float r,h;
    Cone()
    {
        System.out.println("Enter Radius of Cone:");
        r=sc.nextFloat();
        System.out.println("Enter Hight of Cone:");
        h=sc.nextFloat();
    }
    void area()
    {
        float a=3.14f*r*(r+h);
        System.out.println("Area of Cone:"+a);
    }
    void volume()
    {
        float v=0.33f*3.14f*r*r*h;
        System.out.println("Volume of Cone:"+v);
    }

    public static void main(String arg[])
    {
        Sphere ob=new Sphere();
        ob.area();
        ob.volume();
        Cone ob1=new Cone();
        ob1.area();
        ob1.volume();
    }
}