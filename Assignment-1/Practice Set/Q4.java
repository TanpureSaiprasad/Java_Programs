/*Write a Java program to display Fibonacci series. 

Ans=>*/

import java.util.*;
class Fibonacci
{
    public static void main(String arg[])
    {
        int f=0,s=1,t=0,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        n=sc.nextInt();
        System.out.print("Fibonacci series up to"+n+":");
        System.out.print(f+"\t"+s);
        for(i=2;i<n;i++)
        {
            t=f+s;
            f=s;
            s=t;
            System.out.print("\t"+t);
        }
    }
}