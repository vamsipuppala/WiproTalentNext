package Flowcontrol;
import java.util.*;
import java.lang.*;
public class fourteen
 {
    public static void main(String args[]) {
      
      int n=Integer.parseInt(args[0]);
      int sum=0;
      while(n>0)
      {
         sum=sum+(n%10);
         n=n/10;
         
      }
      System.out.print(sum);
    }
}