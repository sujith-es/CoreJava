
public class _16MultipleConstructor {

	private int hour;
	private int minute;
	private int second;

	public _16MultipleConstructor() {

		this(0, 0, 0);
	}

	public _16MultipleConstructor(int h) {

		this(h, 0, 0);
	}

	public _16MultipleConstructor(int h, int m, int s) {

		setTime(h, m, s);
	}

	private void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public static void main(String[] args) {

	}

}
