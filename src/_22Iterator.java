import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class _22Iterator {

	public static void main(String[] args) {

		List<Integer> empIdList = new ArrayList<Integer>();
		empIdList.add(4600);
		empIdList.add(4622);
		empIdList.add(4634);

//		for (Integer item : empIdList) {
//			System.out.println(item);
//		}
//
//		Iterator<Integer> intIterator = empIdList.iterator();
//		System.out.println("using iterator()");
//		while (intIterator.hasNext()) {
//		
//			int empid = intIterator.next();
//			System.out.println(empid);
//		}

		//System.out.println("using ListIterator");
		ListIterator<Integer> empidListIterator = empIdList.listIterator();
		while (empidListIterator.hasNext()) {
			
			int empid = empidListIterator.next();
			empidListIterator.add(100);
			//empidListIterator.set(100);	
			System.out.println(empid);
		}
		
		while (empidListIterator.hasPrevious()){
			System.out.println("Previous Value: " + empidListIterator.previous());
		}
	}
}
