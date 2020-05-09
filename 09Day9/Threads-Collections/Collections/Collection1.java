package DAY9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection1 {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList(); // making object of array-list
		obj.add(3);
		obj.add(5);
		obj.add(2);
		Iterator it = obj.iterator(); // using iterator to operate on a particular value as we don't have index in
										// collections
		while (it.hasNext()) {
			System.out.println(it.next()); // using next method of collection class
		}
		ArrayList newone = new ArrayList();
		newone = (ArrayList) obj.clone(); // making duplicate objects using clone method
		System.out.println(newone);
		Collections.reverse(obj);
		System.out.println(obj);
	}
}

