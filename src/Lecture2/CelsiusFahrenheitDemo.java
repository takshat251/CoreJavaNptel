package Lecture2;

public class CelsiusFahrenheitDemo {

	public static void main(String[] args) {

		int fht = 0, fmax = 300, fstep = 20;
		while (fht <= fmax) {
			int cls = 5 * (fht - 32) / 9;
			int celsius = (int) ((5.0 / 9) * (fht - 32));
			System.out.print(fht + "F" + " " + cls + "C");
			System.out.print("\t");
			System.out.print(fht + "F" + " " + celsius + "C");
			System.out.println();

			fht = fht + fstep;
		}
	}

}
