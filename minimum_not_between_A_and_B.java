import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0,a,b,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        int min=9999;
        for(i=0;i<n;i++)
        {
          if(x[i]<a||x[i]>b)
          {
              if(min>x[i])
              min=x[i];
              count=1;
          }
        }
        if(count==1)
              System.out.println(min);
        else
         System.out.println(-1);
    }
}