/*Write a Java program to keep the count of object created of a class. Display the count 
each time when the object is created.
Ans=> */

import java.lang.*;
class Add
{
    int a,b,c;
    static int cnt=0;
    Add(int p,int q)
    {
        ++cnt;
        System.out.println("Object Count:"+cnt);
        a=p;
        b=q;
    }
    void display()
    {
        c=a+b;
         System.out.println("Addition:"+c);
    }
    public static void main(String arg[])
    {
        Add ob=new Add(10,20);
        Add ob1=new Add(54,78);
        Add ob2=new Add(12,24);
        Add ob3=new Add(33,44);
        ob.display();
        ob1.display();
        ob2.display();
        ob3.display();
    }
}