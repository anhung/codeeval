import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class reverse_words {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputFile = new FileInputStream(args[0]);
		Scanner fileScanner = new Scanner(inputFile);
		ArrayList<String> words = new ArrayList<String>();
		String line;
		Scanner lineScanner;
		
		while (fileScanner.hasNextLine()) {
			line = fileScanner.nextLine();
			if (line.length() > 0) {
				lineScanner = new Scanner(line);
				while (lineScanner.hasNext()) {
					words.add(0, lineScanner.next());
				}
				for (int i = 0; i < words.size(); i++) {
					System.out.print(words.get(i));
					if (i < words.size() - 1) {
						System.out.print(" ");
					}
				}
				words.clear();
				if (fileScanner.hasNextLine()) {
					System.out.println();
				}
			}
		}
		
	}

}
