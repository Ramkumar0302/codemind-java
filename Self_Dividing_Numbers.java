import java.util.*;
class sample
{
    public static boolean selfDividing(int n)
    {
    
        int x=n;
        while(x>0)
        {
            int r;
            r=x%10;
            
            x=x/10;
            if(r==0 || n%r>0)
            return false;
        }
    
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(selfDividing(i))
            System.out.print(i+" ");
        }
    }
}