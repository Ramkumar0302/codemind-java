import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hf,sf,sp;
        hf=sc.nextInt();
        sf=sc.nextInt();
        sp=sc.nextInt();
        if(hf>50 && sf>60 && sp>100)
        System.out.println("10");
        else if(hf>50 && sf>60)
        System.out.println("9");
        else if(sf>60 &&sp>100)
        System.out.println("8");
        else if(hf>50 && sp>100)
        System.out.println("7");
        else if(hf>50 || sf>60 || sp>100)
        System.out.println("6");
        else
        System.out.println("5");
    }
}