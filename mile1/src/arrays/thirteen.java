package arrays;
import java.lang.*;
public class thirteen {
    public static void main(String args[]) {
    int n=args.length;
   if(n<4)
   {
    System.out.println("Please enter 4 integer numbers");   
   }else{
    int k=0;
    int[][] a=new int[2][2];
    System.out.println("The Given Array is: ");
     for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        { a[i][j]=Integer.parseInt(args[k++]);
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    } 
    System.out.println("The Reverse of the Given Array is :");
    k=n-1;
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        { a[i][j]=Integer.parseInt(args[k--]);
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    
   }
    }
}