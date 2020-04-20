package Lecture5;

public class StringPerformance {

	public static void main(String[] args) {
		long Start=System.currentTimeMillis(); 
	appendString(100000);
	long End=System.currentTimeMillis();
	System.out.println(End-Start);

	}
	public static void appendString(int num) {
		String str="";
		for(int n=0;n<num;n++) {
			str=str+n;
		}
		
	}

}
