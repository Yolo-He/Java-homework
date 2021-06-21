package 第10次作业;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class LargestRowsAndColumns {
	
	public static void main(String[] args) throws IOException {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the array size :");
	int size = input.nextInt();
	char[][] a = new char[size][size];
	
	ArrayList<Integer> row_index = new ArrayList<>();
	ArrayList<Integer> column_index = new ArrayList<>();
	
	System.out.println("The random array is");
	int max_sum = 0;
	String s = new String();
	for(int i=0;i<size;i++) {
		int sum = 0;
		s=input.next();
		for(int j=0;j<size;j++) {
			a[i][j]=s.charAt(j);
			sum += Integer.valueOf(a[i][j]);
		}
		if(sum>max_sum) {
			row_index.clear();
			row_index.add(i);
			max_sum = sum;
		}
		else if(sum == max_sum) {
			row_index.add(i);
		}
	}
	
	max_sum = -1;
	for(int j=0;j<size;j++) {
		int sum = 0;
		for(int i=0;i<size;i++) {
			sum += Integer.valueOf(a[i][j]);
		}
		if(sum>max_sum) {
			column_index.clear();
			column_index.add(j);
			max_sum = sum;
		}
		else if(sum == max_sum) {
			column_index.add(j);
		}
	}
	
	System.out.print("The largerst row index: ");
	
	Iterator<Integer> ro = row_index.iterator();
	while(ro.hasNext()) {
		System.out.print(ro.next()+" ");
	}
	
	
	System.out.print("\nThe largerst column index: ");
	Iterator<Integer> co = column_index.iterator();
	while(co.hasNext()) {
		System.out.print(co.next()+" ");
	}
	input.close();
	}

}
