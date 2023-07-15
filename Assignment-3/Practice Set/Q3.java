/*Create a class Doctor(Dno, Dname, Qualification, Specialization). Write a Java program 
to accept the details of ‘n’ doctors and display the details of doctor in ascending order by 
doctor name.
Ans=>*/

import java.util.*;
class Doctor
{
    int dno;
    String dname,quali,sp;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Doctor number:");
        dno=sc.nextInt();
        System.out.println("Enter Doctor Name:");
        dname=sc.next();
        System.out.println("Enter Qualification:");
        quali=sc.next();
        System.out.println("Enter Specification:");
        sp=sc.next();
    }
    void disp()
    {
        System.out.println(dno+"\t"+dname+"\t"+quali+"\t"+sp);
    }
    static void sort(Doctor ob[],int n)
    {
        Doctor t;
        int i,pass;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(ob[i].dname.compareTo(ob[i+1].dname)>0)
                {
                    t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
          ob[i].disp();
    }
    public static void main(String ary[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        Doctor ob[]=new Doctor[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Doctor();
            ob[i].accept();
        }
        sort(ob,n);
    }
}