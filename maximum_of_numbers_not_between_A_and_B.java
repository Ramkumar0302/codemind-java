import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,max,a,b,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
           a=sc.nextInt();
           b=sc.nextInt();
           max=x[0];
           for(i=0;i<n;i++)
           {
              if(x[i]<a || x[i]>b)
              {
               if(x[i]>max)
               max=x[i];
               flag=1;
               }
           }
        //   System.out.println(max);
    if(flag==0)
    System.out.println(-1);
    else
    System.out.println(max);
    }
}