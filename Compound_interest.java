import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r,ci;
         p=sc.nextDouble();
         r=sc.nextDouble();
         t=sc.nextDouble();
        ci=p*(Math.pow((1+r/100),t));
        System.out.format("%.2f",ci);
    }
}