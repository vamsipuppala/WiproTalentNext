package arrays;
import java.lang.*;
public class Seven {
    public static void main(String args[]) {
   int n=args.length;
   int[] a=new int[n];
   for(int i=0;i<n;i++)
   {
     a[i]=Integer.parseInt(args[i]);
   }
   int[] b=new int[n];
   int k=0;
   for(int i=0;i<n;i++)
   { 
       for(int j=i+1;j<n;j++)
       {
           if(a[j]==a[i])
           {
               a[j]=-9999;
           }
       }
       if(a[i]!=-9999)
       a[k++]=a[i];
      
   }
   for(int i=0;i<k;i++)
   System.out.print(a[i]+" ");
   
    }
}