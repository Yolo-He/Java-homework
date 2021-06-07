package 第6次作业;

public class Circle3{
	double radius;
	
	Circle3(){
		radius=1;
	}
	
	Circle3(double newRadius){
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
