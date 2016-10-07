import java.util.Formatter;

public class _37WriteFile {

	private static Formatter formatter;

	public static void OpenFile() {
		try {
			formatter = new Formatter("sujith.txt");
		} catch (Exception e) {
			System.out.println("error occured while opening file.");
		}
	}

	public static void addRecords() {
		formatter.format("%s %s %s", "4600", "sujith", "surendran");
	}

	public static void closeFile() {
		formatter.close();
	}

	public static void main(String[] args) {

		OpenFile();
		addRecords();
		closeFile();
		System.out.println("Successfully processed!");
	}

}
