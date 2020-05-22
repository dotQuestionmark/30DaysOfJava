package DAY21;

import java.util.Map;
import java.util.TreeMap;

// An Example of TreeMap
// A key, value pair class much like another Map implementation, called a HashMap. 
// Apart from storing its data elements in a red-black tree structure, TreeMap maintains an order in the keys stored. 
// Therefore, when we iterate over the keys, we find that they are naturally ordered. Let us see with the help of a simple example.

public class Tree2 {
	public static void main(String[] args) {
		TreeMap<String, Double> treeMap = new TreeMap<>();

		treeMap.put("Paradise Lost", 23.56);
		treeMap.put("Golden Treasury", 12.47);
		treeMap.put("Moon and the Sixpence", 65.28);
		treeMap.put("Holinshed", 7.68);
		treeMap.put("Ancient Mariner", 45.36);

		printAll(treeMap);

		// Keys cannot be duplicates. This will not be stored.
		treeMap.put("Paradise Lost", 23.56);
		printAll(treeMap);

		// Values may be duplicates. This will be stored.
		treeMap.put("Paradise Regained", 23.56);
		printAll(treeMap);
	}

	public static void printAll(TreeMap<String, Double> treeMap) {
		for (Map.Entry<String, Double> et : treeMap.entrySet()) {
			System.out.println(et.getKey() + ": " + et.getValue());
		}
		System.out.println();
	}
}

