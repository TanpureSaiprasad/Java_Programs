/*Define a class product(pid,pname,price). Write a function to accept the product details,
to display product details and to calculate total amount. (use array of Objects)
Ans=> */


 import java.util.*;
 class Product
 {
    int pid,price;
    String pname;
     void accept()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product id:");
        pid=sc.nextInt();
        System.out.println("Enter Product Name:");
        pname=sc.next();
        System.out.println("Enter Product Price:");
        price=sc.nextInt();
     }
     void disp()
     {
        System.out.println(pid+" \t"+pname+" \t"+price);
     }

     public static void main(String ary[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        Product ob[]=new Product[n];
        System.out.println("Enter "+n+" Product Information:");
        for(int i=0;i<n;i++)
        {
            ob[i]=new Product();
            ob[i].accept();
        }  
        System.out.println("Product Information:");
        System.out.println("pid\tname\tPrice");
        int tot=0;
        for(int i=0;i<n;i++)
        {
           ob[i].disp();
           tot=tot+ob[i].price;
        }
          System.out.println("Total Amount:"+tot);
     }
 }