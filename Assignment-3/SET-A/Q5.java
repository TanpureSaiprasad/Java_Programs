/*Q. Write a java program to accept ‘n’ integers from the user & store them in an ArrayList 
collection. Display the elements of ArrayList collection in reverse order. 
Ans=>*/

import java.util.*;
class Array
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit:");
    int n=sc.nextInt();
    ArrayList l=new ArrayList(); 
    System.out.println("Enter numbers:");
    for(int i=0;i<n;i++)
        l.add(sc.nextInt());
    System.out.println("ArrayList:"+l); 
    ArrayList l1=new ArrayList(); 
    for(int i=l.size()-1;i>=0;i--)
        l1.add(l.get(i));
    System.out.println("ArrayList in reverse order:"+l1); 
  }
}