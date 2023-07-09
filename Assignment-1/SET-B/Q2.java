/* Write a java program to accept n numbers from a user store only Armstrong numbers in an array 
and display it
Ans=> */

import java.util.*;
class Arm
{
    public static void main(String[] arg)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter limit:");
       int n=sc.nextInt();
       int a[]=new int[n];
       int j=0;
       System.out.println("Enter "+n+" Numbers:");
       for(int i=0;i<n;i++)
       {  
          int num=sc.nextInt();
          int num1=num;
          int s=0;
          while(num>0)
          {
            int d=num%10;
            s=s+(d*d*d);
            num=num/10;
          }
          if(num1==s)
             a[j++]=num1;
       }
       System.out.println("Array of Armstrong number:");
       for(int i=0;i<j;i++)
          System.out.print(a[i]+"\t");
    }  
}