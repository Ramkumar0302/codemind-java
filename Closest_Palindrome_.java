import java.util.*;
class Sample
{
    public static boolean isPalin(int n)
    {
        int rev=0,temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2;
        n=sc.nextInt();
        for(int i=n+1; ;i++)
        {
            if(isPalin(i))
            {
               d1=i;
               break;
            }
        }
        for(int j=n-1; ;j--)
        {
            if(isPalin(j))
            {
                d2=j;
                break;
            }
        }
        if((d1-n)==(n-d2))
        System.out.println(d2+" "+d1);
        else if((d1-n)>(n-d2))
        System.out.println(d2);
        else
        System.out.println(d1);
        sc.close();
    }
}