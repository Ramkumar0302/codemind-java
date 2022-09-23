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
    public static int revDigit(int n)
    {
        int rev=0,temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
            if(isPrime(m)&&isPrime(revDigit(m)))
            System.out.println("circular prime");
            else if(!isPrime(m))
            System.out.println("not prime");
            else
              System.out.println("prime but not a circular prime");
            }
}