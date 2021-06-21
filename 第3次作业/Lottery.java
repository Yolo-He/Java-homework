package 第3次作业;
import java.util.Scanner;
//5.32
public class Lottery {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int lottery1 = (int)(Math.random() * 10);
	    int lottery2 = (int)(Math.random() * 10);
	    while(lottery2 == lottery1) {
	    	lottery2 = (int)(Math.random() * 10);
	    }
	    System.out.format("Lottery:%d%d\n",lottery1,lottery2);
	    input.close();
	}
}
