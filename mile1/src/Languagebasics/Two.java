package Languagebasics;
import java.util.*;
import java.lang.*;
public class Two {
    public static void main(String args[]) {
      try{
    
      String user=args[0];
      System.out.println("Welcome "+user);
      }catch(Exception e)
      {
          System.out.println(e);
      }
    }
}