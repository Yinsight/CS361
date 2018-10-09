public class Factorial {

	public static int fact(int n) {
		if (n >= 0 && n <= 12) {
			if (n == 0) {
				return 1;
			} else {
				return n * fact(n - 1);
			}
		} else {
			throw new IllegalArgumentException("n has to be >= 0 and <= 12");
		}
	}

	/*public static long factlong(int n) {
		if (n >= 0 && n <= 20) {
			if (n == 0) {
				return 1;
			} else {
				return n * factlong(n - 1);
			}
		} else {
			throw new IllegalArgumentException("n has to be >= 0 and <= 20");
		}
	}

	public static int fib(int n) {
		if (n >= 0 && n <= 45) {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return fib(n - 1) + fib(n - 2);
			}
		} else {
			throw new IllegalArgumentException("n has to be >= 0 and <= 45");
		}
	}
	
	public static int f(int x, int y){
		if (x == 0) {
			return 0;
		} else {
			return f(x-1, f(x,y));
		}
	}

	*/
	
	//public static void main(String[] args) {
		//System.out.println("fact ( -8 ) = " + fact(-8));

		//for (int i = 0; i < 101; i++) {
		//System.out.println("fact ( " + i + " ) = " + fact(i));

		//}

		// for (int i = 0; i < 101; i++) {
		// System.out.println("factlong ( " + i + " ) = " + factlong(i));
		// }

//		for (int i = 0; i < 101; i++) {
//			System.out.println("fib ( " + i + " ) = " + fib(i));
//		}
		
		//System.out.println("f(1,1) = " + f(1,1));

	//}

}