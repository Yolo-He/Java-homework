package 第12次作业;

public class Student implements Comparable{
	private String Num;
	private String Nam;
	private int age;
	
	public Student() {
		
	}
	public Student(String StuNum,String StuNam,int Age) {
		this.Num = StuNum;
		this.Nam = StuNam;
		this.age = Age;
	}
	
	public int compareTo(Object o) {
	    if (!(o instanceof Student))
	      throw new RuntimeException("涓嶆槸Student瀵硅薄");
	    Student p = (Student) o;
	    if (this.age > p.age)
	      return 1;
	    if (this.age == p.age){
	      return this.Nam.compareTo(p.Nam);
	    }
	    return -1;
	}
	
	public String getNum(){
		return Num;
	}
	
	public String getNam(){
		return Nam;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setNum(String Num){
		this.Num = Num;
	}
	
	public void setNam(String Nam){
		this.Nam = Nam;
	}
	
	public void setAge(int Age){
		this.age = Age;
	}
	
}

