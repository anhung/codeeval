import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sum_digits {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputFile = new FileInputStream(args[0]);
		Scanner fileScanner = new Scanner(inputFile);
		String number;
		int sum;
		int asciiAdjustment = 48;
		
		while (fileScanner.hasNext()) {
			sum = 0;
			number = fileScanner.next();
			for (int i = 0; i < number.length(); i++) {
				sum += number.charAt(i) - asciiAdjustment;
			}
			System.out.println(sum);
		}
	}

}
