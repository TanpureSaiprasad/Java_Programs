/*Write a java program to accept details of ‘n’ cricket players(pid, pname, totalRuns, 
InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the details 
of player having maximum average. 
Ans=> */

import java.util.*;
class Cricket
{
    int pid,run,not,ing;
    String pname;
    float avg;
    Cricket()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Player Id:");
        pid=sc.nextInt();
        System.out.println("Enter Player name:");
        pname=sc.next();
        System.out.println("Enter total Runs:");
        run=sc.nextInt();
        System.out.println("Enter Innings Played:");
        ing=sc.nextInt();
        System.out.println("Enter Not Out times:");
        not=sc.nextInt();
        avg=(float)run/ing-not;
    }
    void display()
    {
      System.out.println(pid+"\t"+pname+"\t"+run+"\t"+ing+"\t"+not+"\t"+avg);    
    }
    static void cal(Cricket ob[],int n)
    {
        int index=0;
        float max=ob[0].avg;
       for(int i=1;i<n;i++)
       {
          if(ob[i].avg>max)
          {
            max=ob[i].avg;
            index=i;
          }
       }
       ob[index].display();
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
        Cricket ob[]=new Cricket[n];
        for(int i=0;i<n;i++)
           ob[i]=new Cricket();
        System.out.println("All Player Information:");
        System.out.println("pid\tpname\trun\tinning\tnot out\taverage");
        for(int i=0;i<n;i++)
           ob[i].display();
        System.out.println("Maximum Average Player Information:");
        cal(ob,n);
        
    }
}