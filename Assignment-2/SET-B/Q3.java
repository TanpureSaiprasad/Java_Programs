/*Define a class Student(rollno,name,per). Create n objects of the student class and Display 
 it using toString().(Use parameterized constructor) 
 Ans=> */

import java.util.*;
 class Student
 {
    int rno;
    String name;
    float per;
    Student(int rno,String name,float per)
    {
       this.rno=rno;
       this.name=name;
       this.per=per;
    }
    public String toString()
    {
        return rno+"\t"+name+"\t"+per;
    }

    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Limit:");
       int n=sc.nextInt(); 
       Student ob[]=new Student[n];
       for(int i=0;i<n;i++)
       {
         System.out.println("Enter Roll no. Name Percentage:");
         int r=sc.nextInt();
         String name=sc.next();
         float p=sc.nextFloat();
         ob[i]=new Student(r,name,p);
       }
       System.out.println("Studen Information:");
       for(int i=0;i<n;i++)
       {
         System.out.println(ob[i]);
       }
    }
 }