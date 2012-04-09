public class prime_palindrome {

	public static void main(String[] args) {
		int max = 1000;
		int currentMax = 0;
		
		for (int i = 0; i < max; i++) {
			if (isPalindrome(i) && isPrime(i)) {
				if (i > currentMax) {
					currentMax = i;
				}
			}
		}
		System.out.print("" + currentMax);
	}
	
	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPalindrome(int num) {
		String numberAsString = (new Integer(num)).toString();
		int frontIndex = 0;
		int endIndex = numberAsString.length() - 1;
		boolean done = false;
		while (!done) {
			if (numberAsString.charAt(frontIndex) != 
				numberAsString.charAt(endIndex)) {
				return false;
			}
			if (numberAsString.length() % 2 == 0) {
				if (frontIndex < endIndex) {
					frontIndex++;
					endIndex--;
				}
				else {
					done = true;
				}
			}
			else {
				if (frontIndex != endIndex) {
					frontIndex++;
					endIndex--;
				}
				else {
					done = true;
				}
			}
		}
		return true;
	}

}
