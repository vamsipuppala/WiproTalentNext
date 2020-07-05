package arrays;
import java.util.*;
public class Three {
    public static void main(String args[]) {
      
        int n,ele;
        int[] a={1,2,3,4,5};
        n=a.length;
     
        ele=Integer.parseInt(args[0]);
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                f=1;
                System.out.println("Element found at :"+i+"th index");
                break;
            }
        }
        if(f==0)
        System.out.println("-1");
        
    }
}