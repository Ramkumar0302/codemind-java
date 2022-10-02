import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,m,n;
        t=sc.nextInt();
        while(t>0)
        {
            m=sc.nextInt();
            n=sc.nextInt();
            int sum=m+n;
            System.out.println(sum);
        }
        t--;
    }
}