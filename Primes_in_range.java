import java.util.*;
class Sample
{
    public static boolean isPrime(int n)
    {
        if (n==1)
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
        int m,n,c=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(isPrime(i))
            c++;
        }
        System.out.println(c);
    }
}