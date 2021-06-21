package 第3次作业;
import java.util.Scanner;//Scanner is in the java.util.package
//5.21
public class DifferentInterestRates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amout: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.println("Interest Rate    Monthly Payment    Total Payment ");
		for(double annualInterestRate=5;annualInterestRate<=8;){
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1
					-1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			System.out.format("%.3f%%           ",annualInterestRate);
			System.out.format("%.2f             ",(int)(monthlyPayment * 100) / 100.0);
			System.out.format("%.2f\n",(int)(totalPayment * 100) / 100.0);
			annualInterestRate = annualInterestRate+0.125;
		}
		input.close();
	}
}
