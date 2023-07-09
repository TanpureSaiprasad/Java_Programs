/*Write a java program to search given name into the array, if it is found then display its index 
otherwise display appropriate message.
Ans=> */

import java.util.*;
class Array
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter limit for Array:");
      int n=sc.nextInt();
      int i;
      String s1[]=new String[n];
      System.out.println("Enter "+n+" Name :");
      for(i=0;i<n;i++)
         s1[i]=sc.next();
      System.out.println("Enter Name to search:");
      String name=sc.next();
      int ind=0,f=0;
      for(i=0;i<s1.length;i=i++)
      {
        if(name.equals(s1[i]))
        {
            f=1;
            ind=i;
            break;
        }
      }
      if(f==1)
        System.out.println(name+" Name Found in Array index:"+ind);     
      else
        System.out.println(name+" Name are not Found in Array");    
      
   }
}