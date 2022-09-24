import java.util.*;
class Sample
{
    public static int sumD(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static int prodD(int x)
    {
        int prod=1,r;
        while(x>0)
        {
            r=x%10;
            prod=prod*r;
            x=x/10;
        }
        return prod;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(sumD(n)==prodD(n))
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}