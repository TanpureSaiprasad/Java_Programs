/*Q. Define an Interface “Integer” with a abstract method check().Write a Java program to 
check whether a given number is Positive or Negative. 
Ans=>*/

import java.util.*;
interface Integer
{
    void check(int num);
}
class PN
{
    public void check(int num)
    {
        if(num>0)
          System.out.println(num+" is Positive number ");
        else
          System.out.println(num+" is Nigative numebr");
    }
    public static void main(String arg[])
    {
        PN ob=new PN();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NUmber to Ckeck:");
        int n=sc.nextInt();
        ob.check(n);
    }
}
