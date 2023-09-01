/*Write a Java program to accept a number from command prompt/Command line argument
 and generate multiplication table of a number

Ans=>*/

class Table
{
    public static void main(String arg[])
    {
        int n=Integer.parseInt(arg[0]);    // convert String value into Integer value Using Wrapper class Integer
        System.out.println("Table of number"+n+":");
        for(int i=1;i<=10;i++)
            System.out.println(n*i); 
    }
}
