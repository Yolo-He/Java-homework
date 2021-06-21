package 第3次作业;
//5.25
public class ComputerPI {
	public static void main(String[] args) {
		double sum=0;
		int t=1;
		for(int i=1;i<=1000000;i++){
			sum=sum+t*(1.000000/(2*i-1));
			t=-t;
			if(i%10000==0) {
				System.out.format("i=%-7d, PI=%.16f\n",i,4*sum);
			}
		}
	}
}
