package Languagebasics;
import java.util.*;
public class one {
    public static void main(String args[]) {
      String one=args[0];
      String two=args[1];
      try{
      if(one.equals("Wipro") && two.equals("Bangalore"))
      {
          System.out.println("Wipro Technologies Bangalore"); 
      }else if(one.equals("ABC") && two.equals("Mumbai"))
      {
          System.out.println("ABC Technologies Mumbai");
      }
      }catch(Exception e)
      {
          System.out.println(e);
      }
    }
}