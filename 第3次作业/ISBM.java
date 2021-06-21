package 第3次作业;
//5.36
import java.util.Scanner;

public class ISBM {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of ISBN as integer:");
		
		String str = input.next();
		int n,sum=0;
		String c;
		for(int i=0;i<str.length();i++) {
			c = str.substring(i,i+1);  //切片字符串
			n = Integer.parseInt(c);   //转换成数字
			sum += n * (i+1);
		}
		sum = sum%11;
		if(sum == 10) System.out.format("The ISBN-10  numberis %sX",str);
		else System.out.format("The ISBN-10  numberis %s%d",str,sum%11);
		input.close();
	}

}
