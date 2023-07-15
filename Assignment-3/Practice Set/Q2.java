/*Create a class Teacher(Tid, Tname, Designation, Salary, Subject). Write a Java program 
to accept the details of ‘n’ teachers and display the details of teacher who is teaching 
Java Subject.(Use array of Object)
Ans=> */


import java.util.*;
class Teacher 
{
    String tname,quali,sub;
    int tid;
    float sal;
    void accept()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Teacher Id:");
       tid=sc.nextInt();
       System.out.println("Enter Teacher Name:");
       tname=sc.next();
       System.out.println("Enter Qualification:");
       quali=sc.next();
       System.out.println("Enter Subject:");
       sub=sc.next();
       System.out.println("Enter Salary:");
       sal=sc.nextInt();
    }
    void display()
    {
            System.out.println(tid+"\t"+tname+"\t"+quali+"\t"+sub+"\t"+sal);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        Teacher ob[]=new Teacher[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Teacher();
            ob[i].accept();
        }
        System.out.println("Teacher Information whose Subject is java:");
        for(int i=0;i<n;i++)
          if(ob[i].sub.equals("java"))
            ob[i].display();
    }
}