import java.io.File;

public class _35FileClass {

	public static void main(String[] args) {

		File x = new File("C:\\MyLearning\\Visa_photo-min.jpg");

		if (x.exists()) {
			System.out.println("file exists");
			System.out.println(x.getFreeSpace());
		}

		if (x.isAbsolute()) {
			System.out.println("Is absolute path");
		}

	}

}
