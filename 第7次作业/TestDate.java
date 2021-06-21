package 第7次作业;
import java.util.Date;
//9.3
public class TestDate {
	public static void main(String[] args) {
        for (long l = 10000,i = 0;i < 8;i++){
            Date date = new Date(l);
            toString(l,date);
            l *= 10;
        }
	}
    public static void toString(long l, Date date){
        System.out.println(l + ": " + date.toString());
    }
}
