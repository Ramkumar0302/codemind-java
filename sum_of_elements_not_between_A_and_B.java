import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0,a,b;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
            {
            a=sc.nextInt();
            b=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}