import java.util.*;
class Sample
{
    public static boolean isPrime(int n)
    {
        if (n==1)
        return false;
        
        {
            for(int i=2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                return false;
                
            }
            
        }
        return true;
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n,x[],i,count=0,k;
            n=sc.nextInt();
            x=new int[n];
            for(i=0;i<n;i++)
                x[i]=sc.nextInt();
                k=sc.nextInt();
            
            for(i=0;i<n;i++)
            {
                if(isPrime(x[i]))
                {
                    if(x[i]<=k)
                    count++;
                }
            }
            System.out.println(count);
        
    }
}