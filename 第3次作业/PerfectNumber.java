package 第3次作业;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    for(int i=6;i<=10000;i++) {
	    	int  sum=0;
	    	for(int j=1;j<i;j++) {
	    		if(i%j == 0) sum += j;
	    	}
	    	if(sum == i) System.out.format("%d\n",i);
	    }
	    input.close();
	}
}
