package DAY9;

import java.util.HashSet;

public class Collection3 {
	public static void main(String[] args) {
		HashSet<Integer> obj = new HashSet<>(); // making object of HashSet
		obj.add(3);
		obj.add(2); // Adding values to HashSet
		obj.add(10);
		obj.add(1);
		HashSet newone = new HashSet();
		newone = (HashSet) obj.clone(); // cloning a object in another new object of HashSet
		System.out.println(newone);
//clearing all elements
		newone.clear();
		System.out.println(
				"so once we are done with this After clearing everything newone hashset will look like: " + newone);
		System.out.println(obj.contains(3));
	}
}

