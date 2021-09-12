import java.util.*;

public class simpleCalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Simple Calculator Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the operator");
		String operator = sc.next();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		int result;
		switch (operator.equals()){

		case "+":
			result = num1 + num2;
			System.out.println("The result is " + result);
			break;
		
		case "-":
			result = num1 - num2;
			System.out.println("The result is " + result);
			break;
		
		case "/":
			result = num1 / num2;
			System.out.println("The result is " + result);
			break;
		
		case "*":
			result = num1 * num2;
			System.out.println("The result is " + result);
			break;
		
		default:
			System.out.println("Error: Please choose a valid operator");
		}
	}
}
