import java.util.*;

public class largestInteger {
	
	public static void main(String[] args) {
		
		System.out.println("Enter five numbers and I will display to you the largest of them");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("The largest number out of the five given is : " + num1);
		}
		else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("The largest number out of the five given is : " + num2);
		}
		else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("The largest number out of the five given is : " + num3);
		}
		else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("The largest number out of the five given is : " + num4);
		}
		else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("The largest number out of the five given is : " + num5);
		}
	}
}
