package 第3次作业;

import java.util.Scanner;
//5.38
public class DecimaltoOctal {

	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.print("input the number:");
		int num = input.nextInt();
		int remainner;
		String s = "";
		while(num/8 != 0) {
			remainner = num % 8;
			num = num/8;
			s = s + remainner;
		}
		s = s + num;
		System.out.print("Binary: "+new StringBuffer(s).reverse().toString());
		input.close();
	}

}
