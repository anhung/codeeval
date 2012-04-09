public class sum_prime {

	public static void main(String[] args) {
		int currentNum = 2;
		int count = 0;
		int sum = 0;
		while (count < 1000) {
			if (isPrime(currentNum)) {
				sum += currentNum;
				count++;
			}
			currentNum++;
		}
		System.out.print("" + sum);
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
