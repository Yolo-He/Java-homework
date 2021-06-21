package 第7次作业;
//9.6
import java.util.Random;

public class TestStopWatch {
	public static void main(String[] args) {
		
		int cnt = 100000;
		int number[] = new int[cnt];
		
		Random random = new Random();
		
		for(int i=0;i<cnt;i++) {
			number[i] = (int) (Math.abs(random.nextInt()));
		}

		StopWatch watch = new StopWatch();
		watch.start();
		sort(number,0,cnt-1);
		watch.stop();
		System.out.println("The whole time:" + watch.getElapsedTime()+"ms");
	
	}
	
	public static void sort(int [] a,int start,int end) {
		int min,temp;
		for(int i=start;i<=end;i++) {
			min = i;
			for(int j=i+1;j<=end;j++) {
				if(a[min]>a[j]) {
					temp = min;
					a[min] = a[j];
					a[j] = a[temp];
				}
			}
		}
	}
}





