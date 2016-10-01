import java.util.Scanner;

public class _05WhileLoop {

	public static void main(String[] args) {

		int counter = 0;
		System.out.println("enter a number to print series");
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		/*
		 * while (counter <= number) { System.out.println(counter); counter++;
		 * 
		 * }
		 */

		do {
			System.out.println(counter);
			counter++;
		} while (counter <= number);

	}

}
