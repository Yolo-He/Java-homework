package 第3次作业;
import java.util.Scanner;
//5.28

public class FirstDay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
	      String[] week= {"Sunday","Monday","Tuesday","Wedesday","Thursday","Firday","Saturday"};
	      String[] month= {"","January","February","March","April","May","June",
	                "July","August","September","October","November","Demcember"};
	      System.out.println("input year:");
	      int year=input.nextInt();
	      System.out.println("input January 1th of this year is :");
	      int day=input.nextInt();
	      
	      int cnt=0;
	      for(int i=1;i<=12;i++) {
				System.out.format("%s 1, %d is %s\n",month[i],year,week[day]);
	    	  	if(i==2) {
	    	  		if(year%400==0 || (year%400!=0 && year%4==0)) cnt=29;
	    	  		else cnt=28;
		        }
	    	  	else if(i==1 || i==3 || i==5 || i==7|| i==8|| i==10|| i==12) cnt=31;  
	    	  	else cnt=30;
	  	        day=(day+cnt)%7;
	      }  	
		}finally {
			input.close();
		}
	}
}
