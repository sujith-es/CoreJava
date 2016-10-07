import java.util.LinkedList;

public class _20LinkedList {

	public static void main(String[] args) {

		LinkedList<Comparable> linkedList = new LinkedList<Comparable>();
		System.out.println(linkedList.size());
		linkedList.add(1);
		linkedList.add("Sujith");
		linkedList.add(34.3);
		linkedList.add("Hima");
		linkedList.add(27.6);
		System.out.println(linkedList.size());
		System.out.println(linkedList);
	}
}
