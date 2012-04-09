import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class multiples {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputFile = new FileInputStream(args[0]);
		Scanner fileScanner = new Scanner(inputFile);
		String line;
		Scanner lineScanner;
		int numA, numB, current;
		
		while (fileScanner.hasNextLine()) {
			line = fileScanner.nextLine();
			lineScanner = new Scanner(line);
			lineScanner.useDelimiter(",");
			numA = lineScanner.nextInt();
			numB = lineScanner.nextInt();
			current = numB;
			while (current < numA) {
				current += numB;
			}
			System.out.println(current);
		}
	}

}
