/*Write a java program to display all the even numbers from an array. (Use Command Line 
arguments) 
Ans=>*/

import java.util.*;
class Even
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("all even numbers from array:");
        for(int i=0;i<n;i++)
          if(a[i]%2==0)
            System.out.print(a[i]+"\t");
    }
}
