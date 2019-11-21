
package algorithm.java;

public class PrintGraph{
	
	public static void printDiamond(int size) {
		int l;
		if (size % 2 == 0) {

			l = size / 2;
		} else {
			l = size / 2;
		}

		for (int i = 0; i <= l; i++) {
			// print space
			for (int j = 0; j < l - i; j++) {
				System.out.print(" ");
			}
			// print star
			for (int j = 0; j < 2 * (i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < l; i++) {
			// print space
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			// print star
			for (int j = 0; j < 2 * (l - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printTriangle(int size) {
		int l = size;

		for (int i = 0; i <= l; i++) {
			// print space
			for (int j = 0; j < l - i; j++) {
				System.out.print(" ");
			}
			// print star
			for (int j = 0; j < 2 * (i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printTriangle_2(int size) {
		int l = size;

		for (int i = 0; i < l; i++) {
			// print space
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			// print star
			for (int j = 0; j < 2 * (l - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printRhomboid(int size) {
		int l = size;
		for (int i = 0; i < l; i++) {
			// print space
			for (int j = 0; j < l - i - 1; j++) {
				System.out.print(" ");
			}
			// print star
			for (int j = 0; j < l; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
	public static void printMultiplicationTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + " ");
			}
			System.out.println();
		}
	}


}
