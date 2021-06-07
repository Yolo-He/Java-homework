package 第6次作业;

public class TestCircleWithPrivateDataField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle1 myCircle = new Circle1(5.0);
		System.out.println("The area of the circle of radius " 
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " 
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is " + myCircle.getNumberObjects());
	}

}
