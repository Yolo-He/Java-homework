package 第3次作业;
//5.37
import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.print("input the number:");
		int num = input.nextInt();
		int remainner;
		String s = "";
		while(num/2 != 0) {
			remainner = num % 2;
			num = num/2;
			s = s + remainner;
		}
		s = s + num;
		System.out.print("Binary: "+new StringBuffer(s).reverse().toString());
		input.close();
	}

}
