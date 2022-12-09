import java.util.*;
class Sample
{
    public static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),found=0;
        for(int i=2;i<=(int)n/2;i++)
        {
            for(int j=i+1;j<=(int)n/2;j++)
            {
                if(isPrime(i)&&isPrime(j))
                {
                    if(n==i*j)
                    {
                      System.out.print(i+" "+j);  
                      found=1;
                    }
                }
            
            }
        }
        if(found==0)
        System.out.println("-1");
    }
}