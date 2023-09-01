/*Create a package Mathematics with two classes Maximum and Power. Write a java 
program to accept two numbers from user and perform the following operations on it: 
a. Find Maximum of two numbers. 
b. Calculate the power(XY)
Ans=> */

import java.util.*;
import math.*;
class pack
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        Max m=new Max(a,b);
        Pow p=new Pow(a,b);
    }
}