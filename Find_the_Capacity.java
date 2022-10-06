import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=(2*t*s*b*512)/1024;
        System.out.println(c+"KB");
    }
}