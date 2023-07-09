/*Write a Java program to display Fibonacci series using function. 
Ans=>*/

import java.util.*;
class Fibonacci
{
    Fibonacci(int n)
    {
      int f=0,s=1,t;
      System.out .println("Fibonacci series:");
      System.out .print(f+"\t"+s);
      for(int i=2;i<n;i++)
      {
        t=f+s;
        System.out .print("\t"+t);
        f=s;
        s=t;
      }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter limit:");
        int n=sc.nextInt();
        Fibonacci ob=new Fibonacci(n);
    }
}