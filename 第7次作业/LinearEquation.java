package 第7次作业;
//3.3
import java.util.Scanner;

public class LinearEquation {
	private double a,b,c,d,e,f;
	
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA(){
		return a; 
	}
	public double getB(){
		return b; 
	}
	public double getC(){
		return c; 
	}
	public double getD(){
		return d; 
	}
	public double getE(){
		return e; 
	}
	public double getF(){
		return f; 
	}
	
	public boolean isSolvable() {
		return ((a*d - b*c)!=0);
	}
	
	public double getX() {
		return ((e*d-b*f)/(a*d-b*c));
	}
	public double getY() {
		return ((a*f-e*c)/(a*d-b*c));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input a,b,c,d,e,f : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation l = new LinearEquation(a,b,c,d,e,f);
		if(l.isSolvable()) {
			System.out.println("X : " + l.getX());
			System.out.println("Y : " + l.getY());
		}
		else {
			System.out.println("The eqution has no sulution");
		}
		input.close();
	}
}
