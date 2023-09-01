/*Define a class MyNumber having one private integer data member. Write a default 
constructor to initialize it to 0 and another constructor to initialize it to a value. Write 
methods isNegative, isPositive. Use command line argument to pass a value to the object 
and perform the above tests. 
Ans=>*/

import java.util.*;
class MyNumber
{
    private int n;
    MyNumber()
    {
        n=0;
    }
    MyNumber(int n)
    {
        this.n=n;
    }
    boolean isNegative()
    {
        if(n<0)
          return true;
        else
          return false;
    }
    boolean isPositive()
    {
        if(n>=0)
          return true;
        else
          return false;
    }
    public static void main(String arg[])
    {
        int n=Integer.parseInt(arg[0]);
        MyNumber ob=new MyNumber(n);
        if(ob.isPositive())
          System.out.println("number is Positive");  
        if(ob.isNegative())
          System.out.println("number is Nigative"); 
    }
}