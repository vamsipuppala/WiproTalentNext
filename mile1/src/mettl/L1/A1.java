class A1{
public Result codedarray(int[] input1,int input2){
	int n=input2-1,i;
	   int sum=input1[n];
	   for(i=n-1;i>=0;i--)
	   {
            input1[i]=input1[i]-input1[i+1];
			sum=sum+input1[i];
			System.out.println(input1[i]);
	   }
	   
	   Result re=new Result(input1[0],sum);
	   return re;
    }
}