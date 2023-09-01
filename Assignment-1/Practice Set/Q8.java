/*Write a Java program to accept two numbers using command line argument and calculate 
addition, subtraction, multiplication and division. 
Ans=> */

class Cal
{
    public static void main(String arg[])
    {
        int a,b,c=0;
        a=Integer.parseInt(arg[0]);    // convert String value into Integer value Using Wrapper class Integer
        b=Integer.parseInt(arg[1]);
        c=a+b;
        System.out.println("Additon of Two numbers:"+c);
        c=a-b;
        System.out.println("Substraction of Two numbers:"+c);
        c=a*b;
        System.out.println("Multiplication of Two numbers:"+c);
        float c1=(float)a/b;
        System.out.println("Division of Two numbers:"+c1);
    }
    
}