/*Write a Java program to calculate power of a number using recursion. 
Ans=>*/
import java.util.*;
class Recursion
{
    static int Calculate(int num,int pow)  // our main Function is static so, for accessing sum in main() we use static function
    {
        
        if(pow==0)
          return 1;
        else
          return num*Calculate(num,pow-1);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter Number:");
        int num=sc.nextInt();
        System.out .println("Enter Power:");
        int pow=sc.nextInt();
        int sum=Calculate(num,pow);
        System.out .println("sum of digits of a number:"+sum);
    }
}