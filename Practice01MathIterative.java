class Practice01MathIterative implements Practice01Math{
	
	public int fib (int n) throws Exception {
		if (n <= 0) {
			throw new Exception("n is less than 0");
		}
		
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= n; ++i)
		{
			int prevSum = num1 + num2;
			num1 = num2;
			num2 = prevSum;
		}  
		
		return num1;	
	}
	
	public int fact (int n) throws Exception {
		
		if (n < 0) {
			throw new Exception("n is less than 0");
		}
		
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}