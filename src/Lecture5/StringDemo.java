package Lecture5;

public class StringDemo {

	public static void main(String[] args) {
//		Part1
		String str = "Hello";
		System.out.println(str);
		str = "bye";
		System.out.println(str);// new memory address returned to reference str
//		Part2
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(str.length() - 1));
		System.out.println(str.length());
//		Part3
		str = "Akshat";
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(5, 5));
		System.out.println(str.substring(3, 6));

		System.out.println(str.substring(5));
		System.out.println(str.substring(0));
		// Part4
		String stm = "Hi";
		String stn = "bye";
		String st=stm+stn;
		System.out.println(stm.concat(stn));
		System.out.println(st);
		//Part5
		System.out.println(str.indexOf("ksh"));
		System.out.println(str.indexOf("at"));
		//Part6
		System.out.println(str.startsWith("Aks"));
		System.out.println(str.startsWith("hat"));
		//Part7
		String s1="Hello";
		String s2=s1;
		String s3="Hello";
		String s4=new String("Hello");
		System.out.println((s1==s2)+","+s1.equals(s2));
		System.out.println((s3==s2)+","+s3.equals(s2));
		System.out.println((s4==s1)+","+s4.equals(s1));
		
		
	} 

}
