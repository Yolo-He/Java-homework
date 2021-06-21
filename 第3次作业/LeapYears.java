package 第3次作业;
//5.27
public class LeapYears {
	public static void main(String[] args) {
		int num=0,j=0;
		for(int i=101;i<=2100;i++) {
			if(i%400 == 0) {
				System.out.format("%-4d ",i);
				j++;
			}
			else if(i%100!=0 && i%4==0) {
				System.out.format("%-4d ",i);
				j++;
			}
			if(j==10) {
				System.out.println("");
				j=0;
				num++;
			}
		}
		System.out.format("\nTotal Num:%d",num*10+j);
	}
}
