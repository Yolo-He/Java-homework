package 第3次作业;
import java.util.Scanner;//Scanner is in the java.util.package
//5.17

public class DisplayPyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter thenumberof lines: ");
		int num = input.nextInt();
		for(int i=1;i<=num;i++){
			int start = i;
			for(int j=1;j<=i+num-1;j++){
				if(j<num+1-i) {
					System.out.print(" ");
				}
				else {
					if(j<num){
						System.out.print(start);
						start = start-1;
					}
					if(j>=num) {
						System.out.print(start);
						start = start+1;
					}
				}
				System.out.print(" ");
			}
			System.out.println("");
		}
		 input.close();
	}
}
