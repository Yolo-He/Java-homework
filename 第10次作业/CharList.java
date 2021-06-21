package 第10次作业;

import java.util.ArrayList;
import java.util.Scanner;

public class CharList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("input String:");
    String s = input.nextLine();
    ArrayList list = toCharacterArray(s);
    System.out.println("StringList: " + list.toString());
    input.close();
  }

  public static ArrayList<Character> toCharacterArray(String s){
    char [] charList = s.toCharArray();
    ArrayList <Character> list = new ArrayList<>();
    for(int i = 0 ; i < charList.length ; i++) {
      list.add(charList[i]);
    }
    return list;
  }
}