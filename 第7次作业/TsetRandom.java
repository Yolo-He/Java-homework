package 第7次作业;

import java.util.Random;
//9.4
public class TsetRandom {

	public static void main(String[] args) {
		Random r = new Random(1000);
		for(int i=1;i<=50;i++) {
			System.out.format("%2d ",r.nextInt(100));
			if(i%10 ==0) System.out.print("\n");
		}
	}

}
