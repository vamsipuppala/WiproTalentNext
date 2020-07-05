class A2{
public Result(int[] input1,int input2) { 
 int[] a=new int[input2];
		int n=input2,i,j=0,ma=0,ma1=0;
        for(i=1;i<n;i++)
		{
           if(input1[i]>=input1[i-1])
		   {
			   j=0;
		   }
		   else
		   j++;
		   if(j==1)
		   ma++;
		   if(j>ma1)
		   ma1=j;
		  
		}
		if(ma1!=0)
		ma1++;
		 Result re=new Result(ma,ma1);
		   return re;
    }
}