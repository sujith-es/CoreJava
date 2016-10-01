
public class _14VariableLengthParams {

	public static void main(String[] args) {
		System.out.println(AvegareNumber(1,2,3));

	}

	public static int AvegareNumber(int... numbers) {

		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		return total/numbers.length;

	}

}
