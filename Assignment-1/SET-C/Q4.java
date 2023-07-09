/* Write a java program to display transpose of given matrix
Ans=>*/


import java.util.*;
class Array
{
    public static void main(String[] arg)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter row:");
       int r=sc.nextInt();
       System.out.println("Enter Columns:");
       int c=sc.nextInt();
       int a[][]=new int[r][c];
       System.out.println("Enter "+c*r+" Numbers:");
       for(int i=0;i<r;i++)
       {
         for(int j=0;j<c;j++)
            a[i][j]=sc.nextInt();
       }
       System.out.println("Matrix:");
       for(int i=0;i<r;i++)
       {
         for(int j=0;j<c;j++)
             System.out.print(+a[i][j]+" ");
         System.out.println();
       }
       System.out.println("Transpose of Matrix:");
       for(int i=0;i<c;i++)
       {
         for(int j=0;j<r;j++)
             System.out.print(+a[j][i]+" ");
         System.out.println();
       }
    }  
}