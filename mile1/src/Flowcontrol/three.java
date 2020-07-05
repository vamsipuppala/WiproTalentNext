package Flowcontrol;
public class three {
    public static void main(String args[]) {
    int n=args.length;
    if(n==0)
    System.out.println("No Values");
    else
    {
        for(int i=0;i<n;i++)
        {   if(i<n-1)
            System.out.print(args[i]+",");
            else
            System.out.print(args[i]);
        }
    }
   
    }//System.out.println("");
}