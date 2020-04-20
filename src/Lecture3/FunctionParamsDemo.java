package Lecture3;

public class FunctionParamsDemo {
	public static int val = 20;

	public static void main(String[] args) {
		additionParams(10, 20);
		additionParams(20, 30);
		int subtract = additionReturn(60, 70);// subtract is local variable to main fn.
		System.out.println(subtract);
		int val = 200;
		System.out.println(val);
		System.out.println(FunctionParamsDemo.val);
	}

	public static int additionReturn(int a, int b) {
		int difference = a - b;// a,b,difference are local variables to return fn.
		return difference;

	}

	public static void additionParams(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

	}

}
