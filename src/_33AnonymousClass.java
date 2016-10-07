
public class _33AnonymousClass {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("inside thread");
		}).start();
	}
}
