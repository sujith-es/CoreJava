import java.util.Scanner;

public class _04Swtich {

	public static void main(String[] args) {
		System.out.println("hi! enter your rank to display message.");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();

		switch (option) {
		case 1:
			System.out.println("first rank student");
			break;
		case 2:
			System.out.println("second rank student");
			break;
		default:
			System.out.println("oops no rank matches our records!");
			break;
		}
	}

}
