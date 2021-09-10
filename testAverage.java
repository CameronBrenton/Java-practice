import java.util.*;

public class testAverage {
	public static void main(String[] args) {
		System.out.println("Enter in the test scores and enter -999 when finished. I will then display the sum and the average");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		int testScore = 0;

		while (testScore != -999) {
			testScore = sc.nextInt();
			if (testScore == -999) {
				break;
			}
			sum = sum + testScore;
			i++;
		}
		System.out.println("The sum of the test scores is " + sum);
		System.out.println("The average of the test scores is " + (sum / i));

	}	
}
