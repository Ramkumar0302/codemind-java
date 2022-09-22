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
    public static boolean isPalin(int m)
    {
        int rev=0,temp=m;
        while(m!=0)
        {
            rev=rev*10+m%10;
            m=m/10;
        }
        if(temp==rev)
        return true;
        else
        return false;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=n+1; ;i++)
        {
            if(isPrime(i)&&isPalin(i))
            {
            System.out.println(i);
            break;
            }
        }
    }
}