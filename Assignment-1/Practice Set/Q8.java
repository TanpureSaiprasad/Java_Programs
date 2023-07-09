/*Write a Java program to accept two numbers using command line argument and calculate 
addition, subtraction, multiplication and division. 
Ans=> */

import java.util.*;
class Cal
{
    public static void main(String arg[])
    {
        int a,b,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number First:");
        a=sc.nextInt();
        System.out.println("Enter number Second:");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Additon of Two numbers:"+c);
        c=a-b;
        System.out.println("Substraction of Two numbers:"+c);
        c=a*b;
        System.out.println("Multiplication of Two numbers:"+c);
        float c1=(float)a/b;
        System.out.println("Division of Two numbers:"+c1);
    }
    
}