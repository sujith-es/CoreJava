import java.util.Scanner;

public class _18ArrayInput {

	public static void main(String[] args) {

		int arr[] = new int[5];

		System.out.println("Enter series of numbers up to 5");
		Scanner scanner = new Scanner(System.in);

		try {

			String line = scanner.nextLine();
			String data[] = line.split(" ");

			for (int i = 0; i < data.length; i++) {
				String currentValue = data[i];
				int intValue = Integer.parseInt(currentValue);
				arr[i] = intValue;
			}
		for (int item : arr) {
			System.out.println("Array Values are: " + item);
		}

		} catch (Exception e) {
			System.out.println("Exception: " + e.toString());
		} finally {
			scanner.close();
		}

	}

}
