import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,c,r;
        m=sc.nextInt();
        n=sc.nextInt();
        r=sc.nextInt();
        c=(int)Math.pow(m,n);
      int k=c%r;
      System.out.println(k);
    }
}