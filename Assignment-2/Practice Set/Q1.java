/*Write a Java program to for the implementation of reference variable.
Ans=>*/

class Myclass
{
    void show(String s1)
    {
        System.out.println("String is:"+s1);
    }
}
class Demo
{
    public static void main(String arg[])
    {
        Myclass name=new Myclass();//Create referance to hold object of Myclass
        name.show("Hii.... I'am Your Friend");
    }
}