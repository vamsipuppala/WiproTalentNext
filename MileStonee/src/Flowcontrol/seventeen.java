package Flowcontrol;
import java.util.*;
import java.lang.*;
public class seventeen
 {
    public static void main(String args[]) {
     
      String s=(args[0]);
      int n=s.length();
int i;

    for(i=0;i<n/2;i++)
     {
       if(s.charAt(i)!=s.charAt(n-i-1))
         break;
     }
     if(i!=n/2)
     System.out.println(s+" is not a palindrome");
    else
       System.out.println(s+" is a palindrome");

}
    
}