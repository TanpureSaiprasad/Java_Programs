/* Write a java Program to calculate the sum of first and last digit of a number. 
Ans=> */

import java.util.*;
class Digit
{
    public static void main(String arg[])
    {
        int num,f=0,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        l=num%10;
        while(num>0)
        {
            f=num%10;
            num=num/10;
        }
       int s=f+l;
       System.out.println("sum of first and last digit of a number "+f+"+"+l+"="+s);
    }
    
}