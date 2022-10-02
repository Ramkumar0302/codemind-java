import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,max;
        n=sc.nextInt();
        max=0;
        while(n>0)
        {
            int r=n%10;
            if(max<r)
            max=r;
            n=n/10;
        }
        System.out.println(max);
    }
}