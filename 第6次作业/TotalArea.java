package 第6次作业;

public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle1[] circleArray;
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
		
	}
	public static Circle1[] createCircleArray() {
		Circle1[] circleArray = new Circle1[5];
		for (int i=0;i<circleArray.length;i++) {
			circleArray[i] = new Circle1(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(Circle1[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i = 0; i < circleArray.length ;i++) {
			System.out.printf("%-30s%-15f\n",circleArray[i].getRadius(),
					circleArray[i].getArea());
		}
		System.out.println("____________________________________");
		
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	
	public static double sum(Circle1[] circleArray) {
		double sum=0;
		for(int i=0 ; i < circleArray.length ;i++) {
			sum += circleArray[i].getArea();
		}
		return sum;
	}
}
