/*Define a class person(pid,pname,age,gender). Define Default and parameterised constructor.
 Overload the constructor. Accept the 5 person details and display it.(use this keyword). */

 import java.util.*;
 class Person
 {
    int pid,age;
    String pname,gender;
     Person()
     {
        pid=101;
        pname="Om";
        age=32;
        gender="Male";
     }
     Person(int pid,String pname,int age,String gender)
     {
        this.pid=pid;
        this.pname=pname;
        this.age=age;
        this.gender=gender;
     }
     void display()
     {
        System.out.println(pid+"\t"+pname+"\t"+age+"\t"+gender);
     }

     public static void main(String ary[])
     {
       Scanner sc=new Scanner(System.in);
       Person ob=new Person();
       Person ob1[]=new Person[5];
       for(int i=0;i<5;i++)
       {
         System.out.println("Enter Person Id:");
         int id=sc.nextInt();
         System.out.println("Enter Person Name:");
         String pname=sc.next();
         System.out.println("Enter Person Age:");
         int a=sc.nextInt();
         System.out.println("Enter Person Gender:");
         String g=sc.next();
         ob1[i]=new Person(id,pname,a,g);
       }
       System.out.println("Person Information:");
       ob.display();
      for(int i=0;i<5;i++)
        ob1[i].display();
     }
 }