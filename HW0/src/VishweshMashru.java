public class VishweshMashru {
	public static long fibonacci(long n) {
		long[] fibcache = new long[(int) (n + 1)];
		long nthfib = fibhelper(n, fibcache);
		return nthfib;
	}

	public static long fibhelper(long n, long[] fibcache) {
		if (n <= 1) {
			return n;
		}

		if (fibcache[(int) n] != 0) {
			return fibcache[(int) n];

		}

		fibcache[(int) n] = fibhelper(n - 1, fibcache) + fibhelper(n - 2, fibcache);
		long fib = fibcache[(int) n];

		return fib;

	}

	public static void main(String[] args) {
		System.out.print(fibonacci(10));
	}
}
