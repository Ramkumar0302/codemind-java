import java.util.*;
class Sample
{
    public static boolean isPalin(int n)
    {
        int temp=n;
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
            
        }
        if(temp==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,count=0;
        
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++){
          if(isPalin(x[i]))
            count++;
        }
        System.out.println(count);
        
    }
}