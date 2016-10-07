import java.util.Formatter;

public class _36CreateFile {

	public static void main(String[] args) {

		final Formatter x;

		try {
			x = new Formatter("sujith.txt");
			System.out.println("File created!");

		} catch (Exception e) {
			System.out.println("You got an error.");
		}

	}

}
