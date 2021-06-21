package 第3次作业;
import java.util.Scanner;
//5.29
public class Calender {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    try {
	      String[] month= {"","January","February","March","April","May","June",
	                "July","August","September","October","November","Demcember"};
	      System.out.print("input year:");
	      int year=input.nextInt();
	      System.out.print("input January 1th of this year is :");
	      int day=input.nextInt();
	      
	      int cnt=0;
	      for(int i=1;i<=12;i++) {
	    	  	if(i==2) {
	    	  		if(year%400==0 || (year%400!=0 && year%4==0)) cnt=29;
	    	  		else cnt=28;
		        }
	    	  	else if(i==1 || i==3 || i==5 || i==7|| i==8|| i==10|| i==12) cnt=31;  
	    	  	else cnt=30;
	  		    System.out.format("\n\n\t   %s %d \t\n",month[i],year);
			    System.out.println("---------------------------------");
			    System.out.println("Sun  Mon  Tue  Web  Thu  Fri  Sat");
		        
			    int num=0;
			    for(int j=1;j<=cnt;) { //j记录日期，num记录什么时候换行
					if(num < day && j==1 ) System.out.print("     ");
					else {
						System.out.format("%-3s  ",j);
						j++;
					}
					num++;
					if(num==7 && j!=cnt+1) {
						System.out.print("\n");
						num=0;
					}
			    }
	  	        day=(day+cnt)%7;
	      } 
	    }finally {
	      input.close();
	    }
	   }
}
