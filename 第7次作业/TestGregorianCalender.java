package 第7次作业;
import java.util.GregorianCalendar;

public class TestGregorianCalender {

	public static void main(String[] args) {
		
		GregorianCalendar date =  new GregorianCalendar();
		System.out.print("Current Time:");
		System.out.print(date.get(date.YEAR)+" "+date.get(date.MONTH)
		+" "+date.get(date.DAY_OF_MONTH)+"\n");
		
		long l = 1234567898765L;
		date.setTimeInMillis(l);
		System.out.print("Correspond Time:");
		System.out.print(date.get(date.YEAR)+" "+date.get(date.MONTH)
		+" "+date.get(date.DAY_OF_MONTH));
	}

}
