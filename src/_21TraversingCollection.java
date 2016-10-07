import java.util.ArrayList;
import java.util.Iterator;

public class _21TraversingCollection {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		// System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			// int number = (int) list.get(i);
			// System.out.print(number + " ");
		}

		System.out.println("Using Iterator");
		Iterator it = list.iterator();

		// while (it.hasNext()) {
		// int numb = (int) it.next();
		// System.out.print(numb + " ");
		// }

		Iterator it2 = list.listIterator();

	}
}
