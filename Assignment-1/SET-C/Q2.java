/*Write a java program to display each word in reverse order from a string array.
Ans=>*/

import java.util.*;
class Reverse
{
   public static void main(String arg[])
   {
      String s1=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      s1=sc.nextLine();
      String s2[]=s1.split(" ");
      System.out.print("each word in reverse order: ");
      for(int i=0;i<s2.length;i++)
      {
        StringBuffer sbr=new StringBuffer(s2[i]);
        sbr.reverse();
        System.out.print(sbr+" ");
      }
      
   }
}