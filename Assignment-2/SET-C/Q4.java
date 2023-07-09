/*Write a java program to accept details of ‘n’ books. And Display the quantity of given 
book. 
Ans=>*/

import java.util.*;
class Book
{
    int bid,qty;
    String bname,auth;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book id:");
        bid=sc.nextInt();
        System.out.println("Enter Book name:");
        bname=sc.next();
        System.out.println("Enter Author:");
        auth=sc.next();
        System.out.println("Enter Quantity:");
        qty=sc.nextInt();
    }
    static void search(Book ob[],String bn,int n)
    {
        int i;
       for(i=0;i<n;i++)
       {
        if(ob[i].bname.equals(bn))
        {
            System.out.println("quantity of given book: "+ob[i].qty);
            break;
        }
       }
       if(i==n)
        System.out.println(bn+" Book not found...!!!!");
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        Book ob[]=new Book[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Book();
            ob[i].accept();
        }
        System.out.println("Enter Book name to search:");
        String bn=sc.next();
        search(ob,bn,n);
    }
}