/* Write a Java program to calculate factorial of a number using recursion. 
Ans=>*/

import java.util.*;
class Recursion
{
    static int Calculate(int num) 
    { 
        if(num==0)
          return 1;
        else
          return num * Calculate(num-1);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        int fact=Calculate(num);
        System.out .println("factorial of a number:"+fact);
    }
}