package br.com.vim.calc;

public class Calculadora {

	
	
	public static void sum(double num1, double num2) {
		
		double res = num1 + num2;
		
		System.out.println("the sum of : " + num1 + " plus " + num2 + " is: " + res);
		
		
	}
	public static void sub(double num1, double num2) {
		
		double res = num1 - num2;
		
		System.out.println(" the sub of: " + num1 + " minus " + num2 + " is: " + res);
		
	}
	
	public static void div(double num1, double num2) {
		
		double res = num1 / num2;
		
		System.out.println(" the div of: " + num1 + " with " + num2 + " is: " + res);
		
	}
	
	public static void mult(double num1, double num2) {
		
		double res = num1 * num2;
		
		System.out.println(" the multi of: " + num1 +  " multi " + num2 + " is: " + res);
		
	}
	
}
