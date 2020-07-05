package arrays;
public class Six {
    public static void main(String args[]) {
        int n,tmp;
        int[] a={69,67,55,77,89};
        n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
 System.out.println("Elements After Sorting: ");
        for(int ele : a)
        {
            System.out.print(ele+" ");
        }
    }
}