public class Ex1 {
	int k=0;
	int s=0;
	while(input1>0){
		int rem=input1%10;
		s+=Math.pow(rem, k);
		k=rem;
		input1/=10;
	}
	return s;
}