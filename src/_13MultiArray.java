
public class _13MultiArray {

	public static void main(String[] args) {

		int firstArray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };

		int secondArray[][] = { { 30, 31, 32, 33 }, { 40 }, { 42, 43, 44 } };

		change(firstArray);
	}

	public static void change(int arr[][]) {

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + "\t");
			}
			System.out.println();

		}

	}

}
