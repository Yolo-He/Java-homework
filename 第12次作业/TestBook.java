package 第12次作业;
//链表
import java.util.ArrayList;
import java.util.List;

import 第12次作业.Book;

public class TestBook {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		Book Web = new Book("1","web编程", 20, "机械工业出版社");
		Book DataStructure = new Book("2","数据结构", 20, "机械工业出版社");
		Book Python = new Book("3","Python", 30, "电子工业出版社");
		Book English = new Book("4","大学英语", 15, "电子工业出版社");
		Book Math = new Book("5","高等数学", 18, "高等教育出版社");	
		
		books.add(Web);
		books.add(DataStructure);
		books.add(Python);
		books.add(English);
		books.add(Math);
		
		
		for(Book item:books) {
			System.out.println("Num:"+item.getNum()+" Name:" +item.getNam()+" Price:"
					+item.getPri()+" Publicsher:"+item.getPub());
		}
		
	}

}
