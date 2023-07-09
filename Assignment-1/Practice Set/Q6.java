/* Write a Java program to accept a year and check if it is leap year or not. 
Ans=> */

import java.util.*;
class Leap_year
{
    public static void main(String arg[])
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        y=sc.nextInt();
        if(y%4==0)
            System.out.println(y+" is Leap year");
        else
            System.out.println(y+" is Not Leap year");
    }
    
}