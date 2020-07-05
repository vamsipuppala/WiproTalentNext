package Languagebasics;
import java.util.*;
import java.lang.*;
public class Three {
    public static void main(String args[]) {
      try{
    
      int first_num=Integer.parseInt(args[0]);
      int scnd_num=Integer.parseInt(args[1]);
      System.out.println("Total ="+(first_num + scnd_num));
      }catch(Exception e)
      {
          System.out.println(e);
      }
    }
}