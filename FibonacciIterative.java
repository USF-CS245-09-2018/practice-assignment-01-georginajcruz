
public class FibonacciIterative implements Fibonacci{

	public int fibonacci(int n){
		if (n==0){
			return 0;
		} else if (n==1){
			return 1;
		} else{
			int n1=0;
			int n2=1;
			int n3=0;
			for (int i=n; i>1;i--){
				n3 = n1+n2;
				n1=n2;
				n2=n3;
			}
			return n3;
		}
		
	}

}