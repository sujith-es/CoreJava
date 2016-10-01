import Class.Time;

public class _15TimeClass {

	public static void main(String[] args) {
		Time time = new Time();
		time.setTime(20, 12, 34);
		System.out.println(time.toMilitary());
		System.out.println(time.toString());
	}

}
