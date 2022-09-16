import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,a=0,b=0,d;
        n=sc.nextInt();
         d=(int)Math.log10(n)+1;
         while(n>0)
         {
             int r;
             r=n%10;
             if(n%2==0)
             {
                 a++;
             }
             else if(n%2!=0)
             {
                 b++;
             }
             n=n/10;
         }
         if(d==a)
         System.out.println("Even");
         else if(d==b)
         System.out.println("Odd");
         else
         System.out.println("Mixed");
    }
}