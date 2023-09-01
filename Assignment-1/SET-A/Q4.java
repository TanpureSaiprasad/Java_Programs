/*Write a java program to display all the even numbers from an array. (Use Command Line 
arguments) 
Ans=>*/

class Even
{
    public static void main(String arg[])
    {
        int n=arg.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(arg[i]);
        System.out.println("all even numbers from array:");
        for(int i=0;i<n;i++)
          if(a[i]%2==0)
            System.out.print(a[i]+"\t");
    }
}
