package arrays;
import java.lang.*;
public class Eight{
    public static void main(String args[]) {
    int n=args.length;
    int sum=0,sum1=0,ind6=-1,ind7=-1;
   int[] a=new int[n];
   for(int i=0;i<n;i++)
   {a[i]=Integer.parseInt(args[i]);
   sum+=a[i];
   if(a[i]==6)
   {
       if(ind6==-1)
       {
           ind6=i;
       }
   }
   if(a[i]==7)
   {
       if(ind7==-1 || ind7<i)
       ind7=i;
   }
 
   }
   if(ind6!=-1 && ind7!=-1 && ind6<ind7){
   for(int i=ind6;i<=ind7;i++)
   {
    sum1+=a[i];   
   }
   }
   System.out.println(sum-sum1);
    }
}