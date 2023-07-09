/*Write a java program to display the vowels from a given string. 
Ans=> */

import java.util.*;
class Vowel
{
   public static void main(String arg[])
   {
      String s1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      s1=sc.nextLine();
      System.out.print("Vowels in String are :");
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)=='A'||s1.charAt(i)=='a'||s1.charAt(i)=='E'||s1.charAt(i)=='e'||s1.charAt(i)=='I'||s1.charAt(i)=='i'||s1.charAt(i)=='O'||s1.charAt(i)=='o'||s1.charAt(i)=='U'||s1.charAt(i)=='u')
        {
             System.out.print(s1.charAt(i)+" ");
        }
      }
   }
}