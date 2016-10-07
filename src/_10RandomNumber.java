import java.security.SecureRandom;
import java.util.Random;

public class _10RandomNumber {

	public static void main(String[] args) {
		
		int number=0;
		
		Random rdm = new Random();
		number = rdm.nextInt(3);
		System.out.println(number);
		}
}
