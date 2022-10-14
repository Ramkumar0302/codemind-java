import java.util.*;
 class Primesbetweenminmax
 {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int x[]= new int[50];
	    int n,i,k,count=0,min=9999,max=0,i1=0,i2=0;
		 n=sc.nextInt();   
		  for(i=0;i<n;i++)
		     {
		    x[i]=sc.nextInt();
		     if(min>x[i])
		      { min=x[i];
		       i1=i;
		        }
	         if(max<x[i])
                { max=x[i];
	             i2=i;
	           }
		     }
		     if(i1>i2)
		       {
		           int temp=i1;
		           i1=i2;
		           i2=temp;
		       }
		     for(i=i1;i<=i2;i++)
		     {
		         if(x[i]>=min && x[i]<=max)
		           if(prime(x[i])==1)
		           {
		             
		               count++;
		           }
		     }
		     
	System.out.print(count);
		 
		}
	static	int prime(int p)
		{
		    int i;
		    if(p==1)
		      return 0;
		    for(i=2;i<=Math.sqrt(p);i++)
		       if(p%i==0)
		         return 0;
		     
		       return 1;
		}
}