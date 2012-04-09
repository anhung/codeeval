import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lowercase {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputFile = new FileInputStream(args[0]);
		Scanner fileScanner = new Scanner(inputFile);
		while (fileScanner.hasNextLine()) {
			System.out.println(fileScanner.nextLine().toLowerCase());
		}
	}

}
