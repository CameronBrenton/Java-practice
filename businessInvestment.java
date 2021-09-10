public class businessInvestment {
	
	public static void main(String[] args) {

		double investment = 1000;
		for (int i = 1; i <= 10; i++) {
			investment = investment * 1.05;
			String formattedInvestment = String.format("$%,.2f", investment);
			System.out.println("Year " + i + ": " + formattedInvestment);
		}
		
	}
}
