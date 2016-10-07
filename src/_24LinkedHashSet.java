import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _24LinkedHashSet {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("apple");
		set.add("ball");
		set.add("Apple");
		set.add("beetroot");
		set.add("potato");
		set.add(null);
		System.out.println(set);
		
		Set set1 = new LinkedHashSet();
		set1.add("apple");
		set1.add("ball");
		set1.add("Apple");
		set1.add(null);
		set1.add("beetroot");
		set1.add("potato");
	
		System.out.println(set1);

	}

}
