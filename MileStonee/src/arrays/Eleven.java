package arrays;
import java.lang.*;
public class Eleven {
    public static void main(String args[]) {
   int n=args.length;
   int c=0;
   int i; 
 
   for(i=0;i<n;i++)
   {  if(Integer.parseInt(args[i])!=1 &&             Integer.parseInt(args[i])!=4){

       c++;
      
      }
   }
    if(c==0)
    {
       System.out.println("true");
    }
     else
    {    System.out.println("false");
     }
  
    }
}