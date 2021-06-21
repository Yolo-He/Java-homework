package 第10次作业;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfPolygon {
	
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    ArrayList<Double> listx = new ArrayList<>();
    ArrayList<Double> listy = new ArrayList<>();
    
    System.out.print("Enter the number of points :");
    int n = input.nextInt();
    System.out.print("Enter the coordinates of the points: ");
    for(int i = 0 ; i < n ; i++) {
      listx.add(input.nextDouble());
      listy.add(input.nextDouble());
    }
    
    System.out.println("The total area is " + getArea(listx, listy));
    input.close();
  }

  public static double getArea( ArrayList<Double> listx, ArrayList<Double> listy) {
    double area1 = 0;
    double area2 = 0;
    
    for(int i = 0 ; i < listx.size() - 1 ; i++) {
      area1 += listx.get(i)*listy.get(i+1);
      area2 += listy.get(i)*listx.get(i+1);
    }
    
    area1 +=listx.get(listx.size()-1) * listy.get(0);
    area2 +=listy.get(listx.size()-1) * listx.get(0);
    
    return (area1-area2)/2.0;
  }
}