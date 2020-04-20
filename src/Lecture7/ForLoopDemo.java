
public class ForLoopDemo {
	public static void main(String[] args) {
		for (int count = 1; count <= 5; count++) {
			System.out.println("hello For Loop");
		}
		int count = 1;
		for (; count <= 5; count++) {
			System.out.println("hello For Loop");
		}
		count = 1;
		for (; count <= 5;) {
			System.out.println("hello For Loop");
			count++;
		}
		for (;;) {
			System.out.println("hello For Loop");
		}
	}

}
