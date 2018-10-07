public class FindPrime {
	public static boolean prime(int num) {
		boolean isPrime = true;
		int n = num;
		int i = 2;
		if (n == 1)
			return false;
		else if (n == 0)
			return false;
		else {
			while (i <= n / 2) {
				if (num % i == 0)
					isPrime = false;
				i++;
			}
		}

		return isPrime;

	}
}
