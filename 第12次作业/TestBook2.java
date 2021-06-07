package ��12����ҵ;
//ӳ��
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestBook2 {

	public static void main(String[] args) {
		Map<String,Book> books  = new TreeMap<String,Book>();
		
		books.put("1",new Book("1001","web编程", 20, "机械工业出版�?"));
		books.put("2",new Book("1022","数据结构", 20, "机械工业出版�?"));
		books.put("3",new Book("2033","Python", 30, "电子工业出版�?"));
		books.put("4",new Book("4977","大学英语", 15, "电子工业出版�?"));
		books.put("5",new Book("5311","高等数学", 18, "高等教育出版�?"));
		
		Iterator item = books.entrySet().iterator();
		while(item.hasNext()) {
		   Map.Entry entry = (Map.Entry)item.next();
		   System.out.println(entry.getKey() +" "+((Book)entry.getValue()).getNam()
				   +" "+((Book)entry.getValue()).getNum()+" "+((Book)entry.getValue()).getPri() + " "
				   +((Book)entry.getValue()).getPub());
		}

	}

}
