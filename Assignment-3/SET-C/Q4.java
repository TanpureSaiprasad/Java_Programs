/* Q.Derive a class Square from class Rectangle. Create one more class Circle. Create an interface with only one method called area().
Implement this interface in all classes. Include appropriate data members and constructors in all classes. Write a java program to 
accept details of Square, Circle & Rectangle and display the area.
Ans=>*/

import java.util.*;
interface I
{
    Scanner sc=new Scanner(System.in);
    void area();
}
class Rectangle implements I
{
    float l,w;
   Rectangle()
   {
     System.out.println("Enter Length:");
     l=sc.nextFloat();
     System.out.println("Enter Width:");
     w=sc.nextFloat();
   }
   public void area()
   {
    float a=l*w;
    System.out.println("Area of Rectangle:"+a);
   }
}
class Square extends Rectangle implements I
{
   float s;
   Square()
   {
     System.out.println("Enter side:");
     s=sc.nextFloat();
   }
   public void area()
   {
    super.area();
    float a=s*s;
    System.out.println("Area of Square:"+a);
   }
}
class Circle implements I
{
   float r;
   Circle()
   {
     System.out.println("Enter Radius:");
     r=sc.nextFloat();
   }
   public void area()
   {
    float a=3.14f*r*r;
    System.out.println("Area of Circle:"+a);
   }
}
class MD
{
    public static void main(String arg[])
    {
        Square ob=new Square();
        Circle ob1=new Circle();
        ob.area();
        ob1.area();
    }
}
