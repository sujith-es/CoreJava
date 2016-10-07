package Class;

public class ToStringClass {

	private int month;
	private int day;
	private int year;

	public ToStringClass(int month, int day, int year) {

		this.month = month;
		this.day = day;
		this.year = year;

		System.out.printf("The constructor for ToStringClass is %s", this);

	}

	public String toString() {
		return String.format("%d:%d:%d", month, day, year);
	}
}
