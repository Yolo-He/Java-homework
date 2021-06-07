package 第12次作业;
//集合
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		//鎵撳紑鍐欑殑鏂囨。
		FileWriter fw = new FileWriter ("Student.txt");	
		//Student闆嗗悎
		Set<Student> students = new TreeSet<Student>();
		
//		Student zhao = new Student("20190721","璧靛姏",18);
//		Student Li = new Student("20190601","鏉庡媷",15);
//		Student zhang = new Student("20191121","寮犺　",13);
//		students.add(zhao);
//		students.add(Li);
//		students.add(zhang);
		
		System.out.println("璇风敤 20190721,璧靛姏,18 鐨勬柟寮忚緭鍏ュ鐢熶俊鎭�");
		
		//杈撳叆鍚勪釜瀛︾敓鐨勪俊鎭�
		while(true) {
			String x = input.next();
			String[] data = x.split(",");//鍒囧壊瀛楃涓�
			if(data[0].equals("exit")) {
				break;
			}
			else {
				Student stu = new Student();
				stu.setNum(data[0]);
				stu.setNam(data[1]);
				int y = Integer.parseInt(data[2]);
				stu.setAge(y);
				students.add(stu);
			}
		}
		
		for(Student item:students) {
			fw.write("Num:"+item.getNum()+" Name:"+item.getNam()+" Age:"+item.getAge()+"\n");
		}
		fw.close();
		
		System.out.println("瀛︾敓淇℃伅宸插畬鍏ㄥ～鍏�");
	}
}

//娴嬭瘯鏁版嵁锛�
//20190721,璧靛姏,18
//20190601,鏉庡媷,15
//20191121,寮犺　,13
//exit
