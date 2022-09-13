import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int l,b,w,c,area,a2,a1,cost;
       l=sc.nextInt();
       b=sc.nextInt();
       w=sc.nextInt();
       c=sc.nextInt();
       a1=(b+(2*w))*(l+(2*w));
       a2=l*b;
       area=a1-a2;
       cost=area*c;
       System.out.println(cost);
    }
}