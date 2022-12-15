import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,x[],y[],c=0,count=0;
        n=sc.nextInt();
        m=sc.nextInt();
        x=new int[n];
        y=new int[m];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            y[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        x[j]=-99;
                    }
                }
            }
        }
         for(int i=0;i<m;i++)
        {
            if(y[i]!=-99)
            {
                for(int j=0;j<m;j++)
                {
                    if(y[i]==y[j] && i!=j)
                    {
                        y[j]=-99;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            if(x[i]!=-99)
            {
              for(int j=0;j<m;j++)  
              {
                  if(x[i]==y[j])
                  {
                      c=1;
                  }      
              }
              if(c==1)
                  {
                      count++;
                  }
            }
        }
         for(int i=0;i<m;i++)
        {
            if(y[i]!=-99)
            {
                c=0;
              for(int j=0;j<n;j++)  
              {
                  if(y[i]==x[j])
                  {
                      c=1;
                  }
              }
              if(c==1)
                  {
                      count++;
                  }
            }
        }
        System.out.println(count/2);
   }
}