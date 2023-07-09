/*Write a Java program to for the implementation of this keyword.
Ans=> */

import java.lang.*;
class Add
{
    int a,b,c;       //Global Variable
    Add(int a,int b) //Local variable
    {
        this.a=a;   //Assign Local a value to Global a 
        this.b=b;   //Assign Local b value to Global b 
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
        ob.display();
        ob1.display();
    }
}