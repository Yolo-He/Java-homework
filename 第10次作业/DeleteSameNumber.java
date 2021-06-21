package 第10次作业;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteSameNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Double>list = new ArrayList<>();
    System.out.print("Enter 10 integers: ");
    for(int i = 0 ; i < 10 ; i++)
      list.add(input.nextDouble());
    removeDuplicate(list);
    System.out.println("The distinct integers are " + list.toString());
    
    input.close();
  }
  public static void removeDuplicate(ArrayList<Double> list) {
    for(int i = 0 ; i < list.size() - 1 ; i++ ) {
      for(int j = i + 1 ; j < list.size() ; j++) {
        if(list.get(i).byteValue() == list.get(j).byteValue()) {
          list.remove(j);
        }
      }
    }
  }
}