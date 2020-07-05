package Flowcontrol;
import java.lang.*;
public class six {
    public static void main(String args[]) {
    String gender=args[0];
    int age=Integer.parseInt(args[1]);
    if(gender.equalsIgnoreCase("female") && (age>=1 && age<=58) )
    System.out.println("Percentage of Interest is 8.2%");
    else if(gender.equalsIgnoreCase("female") && (age>=59 && age<=100))
    System.out.println("Percentage of Interest is 9.2%");
    else if(gender.equalsIgnoreCase("Male") && (age>=1 && age<=58))
         System.out.println("Percentage of Interest is 8.4%");
     else  if(gender.equalsIgnoreCase("Male") && (age>=59 && age<=100))
         System.out.println("Percentage of Interest is 10.5%");

    }
}