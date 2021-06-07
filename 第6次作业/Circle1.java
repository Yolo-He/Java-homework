package 第6次作业;

public class Circle1 {
	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public Circle1() {
		numberOfObjects++;
	}
	
	public Circle1(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
