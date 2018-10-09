
public class Question4 {

	public static int recPow(int n) {
		int s = 1;
		if (n >= 0 && n < 31) {
			for (int i = 0; i < n; i++) {
				s = s * 2;
			}
			return s;
		} else
			throw new IllegalArgumentException("n has to be >= 0 and <= 30");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 35; i++) {
			System.out.println(" 2 raised to power of " + i + " " + recPow(i));
		}
	}
}
