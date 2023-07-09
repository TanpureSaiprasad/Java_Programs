/* Write a java program to display alternate character from a given string.
Ans=>*/

import java.util.*;
class Alternet
{
   public static void main(String arg[])
   {
      String s1=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      s1=sc.nextLine();
      System.out.print("Alternet String are :");
      for(int i=0;i<s1.length();i=i+2)
             System.out.print(s1.charAt(i));
      
   }
}