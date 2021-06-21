package 第3次作业;
import java.util.Scanner;//Scanner is in the java.util.package
//5.19
public class PrintPyramidNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
//		System.out.print("Enter the number of lines: ");
//		int num = input.nextInt();
		int num = 8;
		for(int i=1;i<=num;i++){
			int start=0;
			for(int j=1;j<=i+num-1;j++){
				if(j<num+1-i) {
					System.out.print("    ");
				}
				else {
					if(j<num){
						System.out.format("%4d",(int)Math.pow(2,start));
						start = start+1;
					}
					if(j>=num) {
						System.out.format("%4d",(int)Math.pow(2,start));
						start = start-1;
					}
				}
			}
			System.out.println("");
		}
		 input.close();
	}
}
