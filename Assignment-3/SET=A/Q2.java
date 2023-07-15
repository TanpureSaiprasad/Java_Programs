/*Q.Define an Interface Shape with abstract method area(). Write a java program to calculate 
an area of Circle and Sphere.(use final keyword)
Ans=>*/

interface Shape
{
   final float PI=3.142f;
   void area(float r);
} 
class Circle implements Shape
{
   public void area(float r)
   {
      float a=2*PI*r*r;
      System.out.println("Area of Circle:"+a);
   }
}
class Sphere implements Shape
{
   public void area(float r)
   {
      float a=4*PI*r*r;
      System.out.println("Area of Sphere:"+a);
   }
}
class MD
{
   public static void main(String arg[])
   {
      Circle ob=new Circle();
      ob.area(2.6f);
      Sphere ob1=new Sphere();
      ob1.area(5.6f);
   }
}
