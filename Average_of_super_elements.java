import java.util.*;
import java.util.Map.*;
class Sample
{
    public static float Output(int arr[])
    {
        int sum=0,count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
            for(Map.Entry entry:hm.entrySet())
            {
                if((int)entry.getKey()==(int)entry.getValue())
                {
                sum=sum+(int)entry.getKey();
                count++;
                }
            }
        
        if(count==0)
        return -1;
        else
        return (float)sum/count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        float res=Output(x);
        if(res<0)
        System.out.println("-1");
        else
        System.out.format("%.2f",res);
    }
}