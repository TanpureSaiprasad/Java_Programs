/* Write a java program to calculate the sum of even numbers from an array.
Ans=> */

import java.util.*;
class SumEven
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        System.out.println("Enter "+n+" Numbers in array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
              s=s+a[i];
        }
       System.out.println("sum of even numbers from an arra:"+s);
    }
    
}