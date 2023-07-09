/*Write a Java program to accept a number from command prompt and generate 
multiplication table of a number

Ans=>*/

import java.util.*;
class Table
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        System.out.println("Table of number"+n+":");
        for(int i=1;i<=10;i++)
            System.out.println(n*i); 
    }
}
