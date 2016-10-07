import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _38ReadFile {

	private static Scanner scan;

	public static void OpenFile() throws FileNotFoundException {

		try {
			scan = new Scanner(new File("sujith.txt"));
		} catch (Exception e) {
			System.out.println("error occured while opening file.");
		}
	}

	public static void ReadFile() {
		while (scan.hasNext()) {
			String temp1 = scan.next();
			String temp2 = scan.next();
			String temp3 = scan.next();
			System.out.println("\n");

			System.out.printf("%s %s %s", temp1, temp2, temp3);

		}
	}
	
	public static void CloseFile(){
		scan.close();
	}

	public static void main(String[] args) throws FileNotFoundException {

		OpenFile();
		ReadFile();
		CloseFile();
	}

}
