/* Write a java program to display following pattern: 
1 
0 1 
0 1 0 
1 0 1 0
Ans=> */

import java.lang.*;
class Pattern
{
    public static void main(String arg[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i-1;j++)
            {
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}