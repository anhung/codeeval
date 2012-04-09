import java.io.FileInputStream;
import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		try {
			FileInputStream inputFile = new FileInputStream(args[0]);
			Scanner fileScanner = new Scanner(inputFile);
			int numA, numB, max;
			String line;
			Scanner lineScanner;
			
			while (fileScanner.hasNextLine()) {
				line = fileScanner.nextLine();
				lineScanner = new Scanner(line);
				numA = lineScanner.nextInt();
				numB = lineScanner.nextInt();
				max = lineScanner.nextInt();
				
				for (int i = 1; i <= max; i++) {
					if (i % numA == 0 || i % numB == 0) {
						if (i % numA == 0 && i % numB == 0) {
							System.out.print("FB");
						}
						else if (i % numA == 0) {
							System.out.print("F");
						}
						else {
							System.out.print("B");
						}
					}
					else {
						System.out.print("" + i);
					}
					if (i < max) {
						System.out.print(" ");
					}
				}
				if (fileScanner.hasNextLine()) {
					System.out.println();
				}
			}
		}
		catch (Exception e) {
			
		}
		finally {
			
		}

	}

}
