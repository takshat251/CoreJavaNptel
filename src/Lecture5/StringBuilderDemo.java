package Lecture5;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Sudhanil");
		System.out.println(sb);
	    System.out.println(sb.length());
	    sb.append("aks");
	    System.out.println(sb);
	    sb.insert(2, "lovie");
	    System.out.println(sb);
	    sb.insert(sb.length(), 'm');
	    System.out.println(sb);
	    sb.deleteCharAt(5);
	    System.out.println(sb);
	    sb.setCharAt(2, 'd');
	    System.out.println(sb);
	    
	    
	    
		
	

	}

}
