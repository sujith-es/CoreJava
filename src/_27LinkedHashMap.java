import java.util.HashMap;
import java.util.LinkedHashMap;

public class _27LinkedHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(100, "Guru");
		lmap.put(1, "sujith");
		lmap.put(2, "hima");
		
		System.out.println(lmap);
		
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("3", "hima");
		hmap.put("1", "Guru");
		hmap.put("2", "sujith");
		

	System.out.println(hmap);

	}

}
