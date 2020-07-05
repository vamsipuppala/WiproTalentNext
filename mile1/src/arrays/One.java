package arrays;
public class One {
    public static void main(String args[]) {
        int n,sum=0;
        int[] a={1,2,3,4,5};
        n=a.length;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("Total Sum="+sum);
        if(a.length==0)
        System.out.println("Average= 0");
        else
            System.out.println("Average="+(float)sum/n);
    }
}