package 第3次作业;
import java.util.Scanner;//Scanner is in the java.util.package
//5.22
public class RepaymentSchedule {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amout: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
				-1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.format("\nMonthly Payment: %.2f\n",(int)(monthlyPayment * 100) / 100.00);
		System.out.format("Total Payment: %.2f\n\n",(int)(totalPayment * 10000) / 10000.00);
		
		System.out.println("Payment#    Interest    Principal    Banlance");
		double balance=loanAmount;
		for(int i=1;i<=numberOfYears*12;i++){
			double interest = balance*monthlyInterestRate;
			double principal=monthlyPayment-interest;
			balance=balance-principal;
			System.out.format("%-8d    %5.2f  %11.2f %14.2f\n",i,interest,principal,balance);
		}
		 input.close();
	}
}
