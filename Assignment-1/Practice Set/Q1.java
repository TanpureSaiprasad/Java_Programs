 /*Write a java Program to check whether given String is Palindrome or not
Ans:*/

import java.util.*;
class Palindrom
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      String s1=sc.nextLine();
      StringBuffer sbr=new StringBuffer(s1);
      sbr.reverse();
      String s2=new String(sbr); 
      if(s1.equals(s2))
        System.out.println(s1+" is Palindrom String");
      else
        System.out.println(s1+" is  not Palindrom String");
      
   }
}