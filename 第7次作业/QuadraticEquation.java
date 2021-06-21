package 第7次作业;
//9.11
import java.util.Scanner;

public class QuadraticEquation {
	private double a,b,c;

	public QuadraticEquation(double  a,double  b,double  c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double  getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double  getC() {
		return c;
	}
	
	public double  getDiscriminant() {
		return b*b-4*a*c;
	}
	
	public double getRoot1() {
		return (-b + Math.sqrt( getDiscriminant() ) )/(2*a);
	}
	
	public double getRoot2() {
		return (-b - Math.sqrt( getDiscriminant() ) )/(2*a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input a:");
		double  a = input.nextFloat();
		System.out.print("input b:");
		double  b =input.nextFloat();
		System.out.print("input c:");
		double  c = input.nextFloat();
		QuadraticEquation Q = new QuadraticEquation(a,b,c);
		
		if(Q.getDiscriminant() > 0 ) {
			System.out.println("Root1 : " + Q.getRoot1());
			System.out.println("Root2 : " + Q.getRoot2());
		}
		else if(Q.getDiscriminant() == 0) {
			System.out.println("Root : " + Q.getRoot1());
		}
		else {
			System.out.println("The equation has no roots");
		}
		input.close();
	}

}
