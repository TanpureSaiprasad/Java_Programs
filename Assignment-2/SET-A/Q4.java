/*Write a Java program to Copy data of one object to another Object.
Ans=> */

import java.util.*;
class Add
{
    int a,b,c;
    void accept()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter value foe a:");
       a=sc.nextInt();
       System.out.println("Enter value foe b:");
       b=sc.nextInt();
    }
    void copy(Add ob)
    {
        int p=ob.a;
        int q=ob.b;
        c=p+q;
        System.out.println("Addition Using copy Object:"+c);
    }
    public static void main(String arg[])
    {
        Add ob=new Add();
        ob.accept();
        Add ob1=new Add();
        ob1.copy(ob);
    }
}