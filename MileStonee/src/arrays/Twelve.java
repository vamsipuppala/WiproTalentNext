package arrays;
import java.lang.*;
public class Twelve {
    public static void main(String args[]) {
   int n=args.length;
   int c=0;
   int i; 
   int[] a=new int[2];
    if(args.length==6){
     a[0]=Integer.parseInt(args[1]);
     a[1]=Integer.parseInt(args[4]);
 
   for(i=0;i<2;i++)
   System.out.print(a[i]+" ");
      }
      else
          System.out.print("please enter 6 numbers");
   
    }
}