/*Write a Java program to calculate sum of digits of a number. 
Ans=> */

import java.util.*;
class Sum_of_digits
{
    public static void main(String arg[])
    {
        int num,num1,d,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        num=sc.nextInt();
        num1=num;
        while(num>0)
        {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
      System.out.println("sum of digits of a number:"+sum);  
    }
    
}