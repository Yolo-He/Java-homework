package 第6次作业;
import java.util.Scanner;
public class work {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{
		try {
			Circle2 circle1 = new Circle2();
			System.out.println("The area of the circle of radius "+ circle1.radius + " is "+ circle1.getArea());
			
			Circle2 circle2 = new Circle2(25);
			System.out.println("The area of the circle of radius "+ circle2.radius + " is "+ circle2.getArea());
			
			Circle2 circle3 = new  Circle2(125);
			System.out.println("The area of the circle of radius "+ circle3.radius + " is "+ circle3.getArea());
			
			circle1.radius = 100;
			System.out.println("The area of the circle of radius "+ circle1.radius + " is "+ circle1.getArea());
		}finally {
			input.close();
		}
		}
	}
}
