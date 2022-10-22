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
        int n,d1,d2;
        n=sc.nextInt();
        for(int i=n;;i++)
        {
            if(isPrime(i))
            {
                d1=i;
                break;
            }
        }
        for(int j=n;;j--)
        {
            if(isPrime(j))
            {
                d2=j;
                break;
            }
        }
        if((d1-n)>=(n-d2))
        System.out.println(n-d2);
        else
        System.out.println(d1-n);
        
    }
}