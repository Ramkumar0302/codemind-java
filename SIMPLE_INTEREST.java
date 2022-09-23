import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,ci;
         p=sc.nextInt();
         t=sc.nextInt();
         r=sc.nextInt();
        ci=p*t*r/100;
        System.out.println(ci);
    }
}