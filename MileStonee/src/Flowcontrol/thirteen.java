package Flowcontrol;
import java.util.*;
import java.lang.*;
public class thirteen {
    public static void main(String args[]) {
        int f;
           for(int j=10;j<=99;j++){
              f=0;
              for(int i=2;i<=Math.floor(Math.sqrt(j));i++)
              {
                  if(j%i==0)
                  {
                      f=1;
                      break;
                  }
              }
              if(f==0)
              {
                  System.out.print(j+" ");
              }
             }
        
    }
}