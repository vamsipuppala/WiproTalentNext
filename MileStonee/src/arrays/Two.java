package arrays;
import java.util.*;
public class Two {
    public static void main(String args[]) {
        int n,min,max;
        int[] a={1,2,3,4,5};
        min=max=a[0];
        n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("Minimum Element is "+min);
        System.out.println("Max Element is "+max);
    
    }
}