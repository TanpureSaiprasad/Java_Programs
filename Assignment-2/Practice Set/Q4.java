/*Write a Java program to calculate sum of digits of a number using Recursion. 
Ans=> */

import java.util.*;
class Recursion
{
    static int Calculate(int num)  // our main Function is static so, for accessing sum in main() we use static function
    {
        if(num==0)
          return 0;
        else
          return num%10 + Calculate(num/10);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter Number:");
        int num=sc.nextInt();
        int sum=Calculate(num);
        System.out .println("sum of digits of a number:"+sum);
    }
}