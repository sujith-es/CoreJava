import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class _26HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(100, "Guru");
		hmap.put(1, "sujith");
		hmap.put(2, "hima");

		// System.out.println(hmap);
		// System.out.println(hmap.get(109));
		// System.out.println(hmap.values());
		// System.out.println(hmap.keySet());

		Iterator<Entry<Integer, String>> it = hmap.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<Integer, String> ent = it.next();
			System.out.println(ent.getKey() + " ==> " + ent.getValue());

		}
	}

}
