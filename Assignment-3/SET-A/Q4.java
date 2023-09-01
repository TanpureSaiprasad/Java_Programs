/*Q. Define a class Student with attributes rollno and name. Define default and parameterized constructor. Override the toString()
 method. Keep the count of Objects created. Create objects using parameterized constructor and Display the object count
 after each object is created. 
 Ans=>*/

 import java.util.*;
 class Student
 {
    int rno;
    String name;
    static int cnt=0;
    Student()
    {
        ++cnt;
        rno=101;
        name="Sham";
       System.out.println("Object Count="+cnt);
    }
    Student(int rno,String name)
    {
       this.rno=rno;
       this.name=name;
       ++cnt;
       System.out.println("Object Count="+cnt);
    }
    public String toString()
    {
        return rno+"\t"+name;
    }

    public static void main(String arg[])
    {
       Student ob1=new Student();            // call Default Counstructor
       System.out.println(ob1);
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter How many object are you create:");
       int n=sc.nextInt(); 
       Student ob[]=new Student[n];
       for(int i=0;i<n;i++)
       {
         System.out.println("Enter Roll no. Name:");
         int r=sc.nextInt();
         String name=sc.next();
         ob[i]=new Student(r,name);        //allocate memory and call Parameterized Counstructor
       }
       System.out.println("Studen Information:");
       for(int i=0;i<n;i++)
       {
         System.out.println(ob[i]);
       }
    }
 }