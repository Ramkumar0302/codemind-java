import java.util.*;
class Sample
{
    public static boolean validation(long n)
    {
        int count=0;
      int d=(int)Math.log10(n);
      if(d==0)
      return false;
          while(n>0)
          {
             count++;
              n=n/10;
          }
           
            if (count==10)
            return true;
            else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if (validation(n))
        System.out.println("Valid");
        else
        System.out.println("Invalid");
    }
}