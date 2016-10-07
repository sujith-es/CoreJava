import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _40TryResource {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("sujith.txt"))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
