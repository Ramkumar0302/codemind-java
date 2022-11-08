import java.util.*;
class Sample
{
    public static int reverse(int n)
    {
        int rev=0;
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
        int n,x[],i,result=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            result=reverse(x[i]);
        System.out.print(result+" ");
        }
    }
}