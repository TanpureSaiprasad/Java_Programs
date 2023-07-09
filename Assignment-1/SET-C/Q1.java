/*. Write a java program to count the frequency of each character in a given string
Ans=>*/

import java.util.*;
class Count
{
   public static void main(String arg[])
   {
      String s1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      s1=sc.nextLine();
      int j=0;
      char ch[]=new char[100];
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)==' ')
           continue;
         ch[j++]=s1.charAt(i);
      }
      char ch1[]=new char[100];
      int k=0;
      for(int i=0;i<j;i++)
      {
         int m;
          for(m=0;m<=k;m++)
          {
            if(ch[i]==ch1[m])
            break;
          }
          if(m>k)
          {
            ch1[k]=ch[i];
            k++;
          }
      }
      for(int i=0;i<k;i++)
      {
         int cnt=0;
         for(int m=0;m<j;m++)
         {
            if(ch1[i]==ch[m])
              cnt++;
         }
         System.out.println("frequency of "+ch1[i]+" character:"+cnt);
      }
   }
}