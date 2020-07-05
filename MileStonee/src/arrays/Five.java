package arrays;
import java.util.*;
public class Five {
    public static void main(String args[]) {
        int n;
        int[] a={65,66,67,68,69};
        n=a.length;
        int max1,max2,min1,min2;
        max1=max2=-9999999;
        min1=min2=9999999;
        for(int i=0; i<n; i++)
    {
        if(a[i] > max1)
        {
            max2 = max1;
            max1 = a[i];
        }
        else if(a[i] > max2 && a[i] < max1)
        {
            max2 = a[i];
        }
        
        if(a[i]<min1)
        {
            min2=min1;
            min1=a[i];
        }else if(a[i]>min1 && a[i]<min2)
        {
            min2=a[i];
        }
    }
System.out.println("First Maximun:"+max1);

System.out.println("Second Maximun:"+max2);

System.out.println("First Minimum:"+min1);

System.out.println("Second Minimum:"+min2);
        
    }
}