package Flowcontrol;
import java.util.*;
import java.lang.*;
public class one {
    public static void main(String args[]) {
      int  len=args.length;
      if(len==0)
      {
          System.out.println("Argument is Expected");
      }
      else
      {
          int num=Integer.parseInt(args[0]);
          if(num>=0)
          {
              System.out.println(num+" is Positive Number");
          }else if(num==0)
          {
              System.out.println(num+" is neither Negative Nor Positive Number");
              
          }else
          {
              System.out.println(num+ " is negative Number");
          }
      }
    }
}