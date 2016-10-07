import java.util.HashSet;
import java.util.Set;

public class _23HashSet {

	public static void main(String[] args) {

		Set<Double> set = new HashSet<Double>();
		set.add(1.0);
		set.add(1.34);
		set.add(3.44);
		set.add(9.37);
		//System.out.println(set);

		set.clear();
		//System.out.println(set);
		
		Set set1 = new HashSet();
		set1.add("apple");
		set1.add("ball");
		set1.add("Apple");
		System.out.println(set1);
	}

}
