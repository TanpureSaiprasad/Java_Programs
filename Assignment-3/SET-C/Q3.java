/*Q. Define an abstract class Staff with members name &address. Define two sub classes FullTimeStaff(Departmet, Salary)and 
PartTimeStaff(numberOfHours, ratePerHour). Define appropriate constructors. Create n objects which could be of either FullTimeStaff 
or PartTimeStaff class by asking the user’s choice. Display details of FulltimeStaff and PartTimeStaff.
Ans=>*/

import java.util.*;
abstract class Staff
{
   String name,addr;
   Staff(String name,String addr)
   {
     this.name=name;
     this.addr=addr;
   }
}
class FullTimeStaff extends Staff
{
   float sal;
   String dept;
   FullTimeStaff(String name,String addr,String dept,float sal)
   {
      super(name,addr);
      this.dept=dept;
      this.sal=sal;
   }
   void disp()
   {
     System.out.println("Name:"+name);
     System.out.println("Address:"+addr);
     System.out.println("Department:"+dept);
     System.out.println("Salary:"+sal);
   }
}
class PartTimeStaff extends Staff
{
   int hr,rate;
   PartTimeStaff(String name,String addr,int hr,int rate)
   {
      super(name,addr);
      this.hr=hr;
      this.rate=rate;
   }
   void disp()
   {
     System.out.println("Name:"+name);
     System.out.println("Address:"+addr);
     System.out.println("number Of Hours:"+hr);
     System.out.println("rate Per Hour:"+rate);
     System.out.println("Total Salary:"+(hr*rate));
   }
}
class MD
{
    public static void main(String arg[])
    {
       int ch,i,n;
       FullTimeStaff ob[]=new FullTimeStaff[20];
       PartTimeStaff ob1[]=new PartTimeStaff[20];
       
        Scanner sc=new Scanner(System.in);
       do{
            System.out.println("______________________________________________________");
            System.out.println("1-Full Time Staff \n 2-Part Time Staff");
            System.out.println("Enter Choice:");
            ch=sc.nextInt();
           
            switch(ch)
            {
               case 1: System.out.println("Enter Limit:");
                       n=sc.nextInt();
                       for(i=0;i<n;i++)
                       {
                         System.out.println("Enter Name:");
                         String name=sc.next();
                         System.out.println("Enter Address:");
                         String addr=sc.next();
                         System.out.println("Enter Department:");
                         String dept=sc.next();
                         System.out.println("Enter Salary:");
                         int sal=sc.nextInt();
                         ob[i]=new FullTimeStaff(name,addr,dept,sal);
                       }
                       System.out.println("______________________________________________________");
                       System.out.println("details of Full time Staff:");
                       for(i=0;i<n;i++)
                       {
                            ob[i].disp();
                            System.out.println();
                       }
                       break;
               case 2: System.out.println("Enter Limit:");
                       n=sc.nextInt();
                       for(i=0;i<n;i++)
                       {
                         System.out.println("Enter Name:");
                         String name=sc.next();
                         System.out.println("Enter Address:");
                         String addr=sc.next();
                         System.out.println("number Of Hours:");
                         int hr=sc.nextInt();
                         System.out.println("Enter rate Per Hour:");
                         int rate=sc.nextInt();
                         ob1[i]=new PartTimeStaff(name,addr,hr,rate);
                       }
                       System.out.println("______________________________________________________");
                       System.out.println("details of Part time Staff:");
                       for(i=0;i<n;i++)
                       {
                            ob1[i].disp();
                            System.out.println();
                       }
                       break;
            }
       }while(ch<3);
    }
}