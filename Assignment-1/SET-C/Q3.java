/* Write a java program for union of two integer array
Ans=>*/

import java.util.*;
class Union
{
    public static void main(String[] arg)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter limit:");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter "+n+" Numbers for first Array:");
       for(int i=0;i<n;i++)
           a[i]=sc.nextInt();

       int b[]=new int[n];
       System.out.println("Enter "+n+" Numbers for Second Array:");
       for(int i=0;i<n;i++)
           b[i]=sc.nextInt();

        int c[]=new int[100];
        int k=0;
        for(int i=0;i<n;i++)
          c[k++]=a[i];
        int j;
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                   f=1;
                   break;   
                }
                 
            }
            if(f==0)
              c[k++]=b[i];
        }
        System.out.println(" union of two integer array:");
        for(int i=0;i<k;i++)
          System.out.print(c[i]+"\t");
    }  
}