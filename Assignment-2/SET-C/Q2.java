/*Write a java program to accept n employee names from user. Sort them in ascending 
order and Display them.(Use array of object nd Static keyword) 
Ans=>*/

import java.util.*;
class Emp
{
    int eno;
    String name;
    float sal;
    Emp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee no.:");
        eno=sc.nextInt();
        System.out.println("Enter Employee name:");
        name=sc.next();
        System.out.println("Enter Employee salary:");
        sal=sc.nextFloat();
    }
    void display()
    {
      System.out.println(eno+"\t"+name+"\t"+sal);  
      
    }
    static void sort_Name(Emp ob[],int n)
    {
        Emp t;
        int pass,i;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(ob[i].name.compareTo(ob[i+1].name)>0)
                {
                    t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }
       for(i=0;i<n;i++) 
          ob[i].display();
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        Emp ob[]=new Emp[n];
        for(int i=0;i<n;i++)
           ob[i]=new Emp();
        System.out.println("Employee Information in ascending by name:");
        sort_Name(ob,n);       
    }
}