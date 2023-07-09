/* Write a java program to accept n city names and display them in ascending order
Ans=>*/

import java.util.*;
class City
{
  public static void main(String arg[])
    {
        int pass,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        String city[]=new String[100];
        System.out.println("Enter "+n+" City name:");
        for(i=0;i<=n;i++)
           city[i]=sc.nextLine();
        String t;
        for(pass=1;pass<=n;pass++)
        {
            for(i=0;i<=n-pass;i++)
            {
                if(city[i].compareTo(city[i+1])>0)
                {
                    t=city[i];
                    city[i]=city[i+1];
                    city[i+1]=t;
                }
            }
        } 
        System.out.println("City name in Ascending Order:");
        for(i=0;i<=n;i++)  
          System.out.println(city[i]); 
    }
}