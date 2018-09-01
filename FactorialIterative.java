

public class FactorialIterative implements Factorial{

	public int factorial(int n){
		int x=n;
		for (int i=1; i<n; i++){
			x=x*(i);
		}
		return x;
	}

}