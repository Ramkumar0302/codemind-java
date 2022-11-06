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
        int min=x[0];
        int max=x[0];
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
               if(x[i]==count)
               {
                   if(x[i]<min)
                   min=x[i];
                   else
                   max=x[i];
                   found=1;
               }
            }
        }    
             if(found==1)
               System.out.println(min+" "+max);
               else
               System.out.println("-1");
              
    }
}