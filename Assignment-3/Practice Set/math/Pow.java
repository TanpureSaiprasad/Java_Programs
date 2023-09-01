package math;
public class Pow
{
    public Pow(int x,int y)
    {
        int ans=1;
        for(int i=1;i<=y;i++)
           ans=ans*x;
        System.out.println(x+" raise to "+y+"= "+ans);
    }
} 