import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,count=0,c=0,sum=0,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
       int a=sc.nextInt();
       int b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a&& x[i]<=b)
            {
                count++;
                System.out.print(x[i]+" ");
            }
        }
        if(count==0)
        System.out.println("-1");
    }
}    
    