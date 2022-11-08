import java.util.*;
class Sample
{
    public static int Add(int n)
    {
        int count=0,r;
        while(n!=0)
        {
            r=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,result=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==0)
            x[i]=1;
            result=Add(x[i]);
            
        System.out.print(result+" ");
        }
    }
}