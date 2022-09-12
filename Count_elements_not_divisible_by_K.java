import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,x[];
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]%k!=0)
               count++;
        }
        System.out.println(count);
    }
}