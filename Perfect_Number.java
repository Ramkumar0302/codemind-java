import java.util.*;
class Sample
{
    public static boolean isPerfect(int n)
    {
        int sum=0;
            for(int i=1;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
            if(n==sum)
            return true;
            else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPerfect(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}