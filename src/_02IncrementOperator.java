
public class _02IncrementOperator {

	public static void main(String[] args) {

		int apple = 11;
		int ball = 7;

		System.out.println(++apple);
		System.out.println(apple++);
		System.out.println(apple);

		System.out.println("****** Assignment ***********");
		// ball = ball+3;
		// ball += 3;
		ball %= 3;
		System.out.println(ball);
	}

}
