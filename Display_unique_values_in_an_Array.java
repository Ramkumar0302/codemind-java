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
        for(i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-99)
            {
               for(int j=0;j<n;j++)
               {
                   if(x[i]==x[j] && i!=j)
                   {
                       x[j]=-99;
                       count++;
                   }
               }
               if(count==1)
               {
               System.out.print(x[i]+" ");
               found=1;
               }
            }
        }
        if(found==0)
        System.out.println("-1");
    }
}