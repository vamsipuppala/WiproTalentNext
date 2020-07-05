package arrays;
import java.lang.*;
public class Ten {
    public static void main(String args[]) {
   int n=args.length;
   int c=0;
   int i; 
   int[] a=new int[n];
   for(i=0;i<n;i++)
   {  if(Integer.parseInt(args[i])%2==0){
     a[c]=Integer.parseInt(args[i]);
       c++;
      
      }
   }
   for(i=0;i<n;i++)
   {  if(Integer.parseInt(args[i])%2!=0){
     a[c]=Integer.parseInt(args[i]);
       c++;
      
      }
   }
   
   for(i=0;i<n;i++)
   System.out.print(a[i]+" ");
   
    }
}