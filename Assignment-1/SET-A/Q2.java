/*Write a java Program to display all the perfect numbers between 1 to n.
Ans=> */

import java.util.*;
class Per
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        n=sc.nextInt();
        System.out.println("perfect numbers between 1 to "+n);
        for(int i=1;i<n;i++)
        {
          int sum=0;
          for(int j=1;j<i;j++)
          {
             if(i%j==0)
               sum=sum+j;
          }  
          if(sum==i)
            System.out.print("\t"+i);     
        }
        
    }
}