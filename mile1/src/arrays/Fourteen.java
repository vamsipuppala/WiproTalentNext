package arrays;
import java.lang.*;
public class Fourteen {
    public static void main(String args[]) {
    int n=args.length;
   if(n<9)
   {
    System.out.println("Please enter 9 integer numbers");   
   }else{
    int k=0;
    int[][] a=new int[3][3];
    int max=Integer.parseInt(args[0]);
    System.out.println("The Given Array is: ");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        { a[i][j]=Integer.parseInt(args[k++]);
        if(a[i][j]>max)
        max=a[i][j];
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The biggest number in the given array is "+max);
    
   }
    }
}