/*Write a java program to calculate area of Cylinder and Circle.(Use super keyword)
Ans=>*/

import java.util.*;
class Cylinder
{
   float r,h;
   Scanner sc=new Scanner(System.in);
   void area()
   {
      System.out.println("Enter redius:");
      r=sc.nextFloat();
      System.out.println("Enter height:");
      h=sc.nextFloat();
      float a=(2*3.14f*r*h)+(2*3.14f*r*r);
      System.out.println("Area of Cylinder:"+a);  
   }
}
class Circle extends Cylinder
{
   float r;
   void area()
   {
      super.area();
      System.out.println("Enter redius:");
      r=sc.nextFloat();
      float a=3.14f*r*r;
      System.out.println("Area of Circle:"+a);  
   }
}
class CC
{
    public static void main(String arg[])
    {
        Circle ob=new Circle();
        ob.area();
    }
}