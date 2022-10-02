import java.util.*;
class sample
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int m,n,c=0,d=0;
    m=sc.nextInt();
    n=sc.nextInt();
    for(int i=1;i<=m/2;i++)
    {
        if(m%i==0)
        c=c+i;
    }
    for(int j=1;j<=n/2;j++)
    {
        if(n%j==0)
        d=d+j;
    }
    if(m==d || n==c)
    System.out.println("Amicable");
    else
    System.out.println("Not Amicable");
    
}
}