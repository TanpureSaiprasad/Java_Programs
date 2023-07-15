/*Create abstract class Shape with abstract method area().Write a Java program to 
calculate are of Rectangle and Triangle.(Inherit Shape class in classes Rectangle and 
Triangle )
Ans=>*/

import java.util.*;
abstract class Shape
{
    Scanner sc=new Scanner(System.in);
    abstract void area();
}

class Rectangle extends Shape
{
  void area()
  {
    System.out.println("Enter length for Rectangle:");
    float l=sc.nextFloat();
    System.out.println("Enter Bredth for Rectangle:");
    float b=sc.nextFloat();
    float c=l*b;
    System.out.println("Area of Rectangle:"+c);
  }
}

class Triangle extends Shape
{
  void area()
  {
    System.out.println("Enter Hight for Triangle:");
    float h=sc.nextFloat();
    System.out.println("Enter Base for Triangle:");
    float b=sc.nextFloat();
    float c=0.5f*h*b;
    System.out.println("Area of Triangle:"+c);
  }
}

class S
{
   public static void main(String arg[])
   {
      Rectangle ob=new Rectangle();
      ob.area();
      Triangle ob1=new Triangle();
      ob1.area();
   }
}
