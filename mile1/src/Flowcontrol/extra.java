package Flowcontrol;
import java.util.*;
import java.lang.*;
public class extra {
    public static void main(String args[]) {
      int len=args.length;
      if(len==0)
      {
          System.out.println("Please Enter an Integer Number");
      }
      else
      {
          int num=Integer.parseInt(args[0]);
          if(num==0 || num==1)
          {
              System.out.println(num+" is Neither Prime Nor Composite");
          }
          else {
              int f=0;
              for(int i=2;i<=Math.floor(Math.sqrt(num));i++)
              {
                  if(num%i==0)
                  {
                      f=1;
                      break;
                  }
              }
              if(f==0)
              {
                  System.out.println(num+" is  Prime Number");
          }else
          System.out.println(num+" is Composite Number");
          
              }
          }
      }
}