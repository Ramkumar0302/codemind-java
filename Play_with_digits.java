import java.util.*;
class Sample
{
    public static int Add(int n)
    {
        int sum=0,r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,result,s=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s=s+Add(x[i]);
        }
        System.out.println(s);
    }
}