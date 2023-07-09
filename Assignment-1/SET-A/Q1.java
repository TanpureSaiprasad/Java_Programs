/* Write a java Program to check whether given number is Prime or Not.
Ans=> */

import java.util.*;
class Prime
{
    public static void main(String arg[])
    {
        int n,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
               flag=1;
        }
        if(flag==0)
          System.out.println("Given number "+n+" is a Prime number");
        else
          System.out.println("Given number "+n+" is Not a Prime number");
    }
}