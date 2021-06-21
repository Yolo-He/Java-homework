package 第3次作业;
//5.26
public class ComputerE {
	public static void main(String[] args) {
		double sum=1;
		double jiecheng=1;
		double chu=1;
		for(int i=1;i<=1000000;i++){
			double a=chu/i;
			jiecheng=jiecheng*a;
			sum=sum+(jiecheng);
			if(i%10000==0) {
				System.out.println(sum);
			}
		}
	}
}
