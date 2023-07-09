/* Write a java Program to accept employee name from a user and display it in reverse order
Ans=> */

import java.util.*;
class Emp
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name=sc.nextLine();
        StringBuffer name1=new StringBuffer(name);
        name1.reverse(); 
        System.out.println("Name in reverse Order:"+name1);        
    }
}