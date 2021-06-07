package 第6次作业;
public class Circle4 {
	public static void main(String[] args) {
			Circle4 circle1 = new Circle4();
			System.out.println("The area of the circle of radius "+ circle1.radius + " is "+ circle1.getArea());
			
			Circle4 circle2 = new  Circle4(25);
			System.out.println("The area of the circle of radius "+ circle2.radius + " is "+ circle2.getArea());
			
			Circle4 circle3 = new  Circle4(125);
			System.out.println("The area of the circle of radius "+ circle3.radius + " is "+ circle3.getArea());
			
			circle1.radius = 100;
			System.out.println("The area of the circle of radius "+ circle1.radius + " is "+ circle1.getArea());
	}
	double radius;
	
	Circle4(){
		radius=1;
	}
	
	Circle4 (double newRadius){
		radius = newRadius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
