package DAY21;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

// An Example of TreeSet
// As we know, the property of Set implementation ensures that the tree shall not contain any duplicates 
// when storing the data element in a tree. In contrast to other set implementations, 
// the TreeSet guarantees that the data elements stored will be sorted by default according to the natural 
// ordering of the elements. Let's have a glimpse of its usage with the help of a simple example.

public class Tree {
	public static void main(String[] args) {
		Integer[] nums = { 2, 4, 1, 6, 3, 7, 9, 5 };
		SortedSet<Integer> tree = new TreeSet<>(Arrays.asList(nums));

		// Print first and last element
		System.out.println(tree.first());
		System.out.println(tree.last());

		printAll(tree);
		// False. Set does not allow duplicates,
		// so this will not be added.
		System.out.println(tree.add(1));

		// But, this will be added because 11 is not a duplicate
		System.out.println(tree.add(11));
		printAll(tree);

		printAll(tree.headSet(7));
	}

	public static void printAll(SortedSet<Integer> tree) {
		for (int s : tree) {
			System.out.println(s);
		}
		System.out.println();
	}
}

