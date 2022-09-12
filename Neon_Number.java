import java.util.*;
class Sample
{
    public static String isNeon(int m)
    {
        int temp=m,sum=0;
        m=m*m;
        while(m>0)
        {
          
          sum=sum+m%10;
          m=m/10;
        }
        if(sum==temp)
        return "Neon Number";
        else 
        return "Not Neon Number";
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        
        System.out.println(isNeon(n));
        
        
    }
}