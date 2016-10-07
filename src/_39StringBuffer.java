
public class _39StringBuffer {

	public static void main(String[] args) {
		String str = "study";
		str.concat("tonight");
		System.out.println(str);

		StringBuffer sb = new StringBuffer("study");
		sb.append("Tonight");
		System.out.println(sb.toString());
	}

}
