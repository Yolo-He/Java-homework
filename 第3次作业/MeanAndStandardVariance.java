package 第3次作业;
//5.45
import java.util.Scanner;

 class MeanAndStandardVariance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input the numbers,end of 0 :");
		double sum = 0;
		double num[] = new double[1000];
		int cnt=0;
		double temp=0,var=0;
		while(true) {
			temp = input.nextInt();
			if(temp == 0) break;
			num[cnt] = temp;
			sum += temp;
			cnt++;
		}
		double ave = sum/cnt;
		for(int i=0;i<cnt;i++) {
			var += (num[i] - ave)*(num[i] - ave);
		}
		System.out.println("The ave : " + ave);
		System.out.println("The var : " + var/cnt);
		input.close();
	}
}
