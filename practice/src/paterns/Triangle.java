package paterns;

/**
 * @author amit patil
 *
 */
public class Triangle {
	public static void main(String[] args) {
		for (int i = 5; i >=1; i--) {
			for (int space = (5 - i)*2; space >0; space--) {
				System.out.print(" ");

			}
			int j = i + (1 * (i - 1));
			for (int m = 1; m <= j; m++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
