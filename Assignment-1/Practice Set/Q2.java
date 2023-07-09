/*Write a Java program which accepts three integer values and prints the maximum and minimum.

Ans=> */

import java.util.*;
class MinMax
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter Third Number:");
        int c=sc.nextInt();

        if(a>b && a>c)                                            
            System.out.println(" Number First "+a+" is Maximum");
        else if(b>a && b>c)
            System.out.println(" Number Second "+b+" is Maximum"); 
        else if(c>a && c>b)
            System.out.println(" Number Third "+c+" is Maximum"); 
        else  
            System.out.println(" Numbers are Same");

         if(a<b && a<c)                                            
            System.out.println(" Number First "+a+" is Minimum");
        else if(b<a && b<c)
            System.out.println(" Number Second "+b+" is Minimum"); 
        else
            System.out.println(" Number Third "+c+" is Minimum");
    }
}
