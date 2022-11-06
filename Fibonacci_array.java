import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        if(n<=2)
        {
            System.out.println("no");
            System.exit(0);
        }
    for(int i=2;i<n;i++)
        {
           if(x[i]==x[i-1]+x[i-2])
           {
            count++;
           }
        }
        if(count==n-2)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}