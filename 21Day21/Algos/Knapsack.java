package DAY21;

public class Knapsack {
	// A utility function that returns maximum of two integers
	static int max(int a, int b) {
		return (a > b) ? a : b;// remember we did this on the first week this a normal if else statement so
							   // don't get confused
	}

	// Returns the maximum value that can
	// be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int n) {
		// Base Case
		if (n == 0 || W == 0)// we will be 
			return 0;

		// If weight of the nth item is more
		// than Knapsack capacity W, then
		// this item cannot be included in the optimal solution
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
	}

	public static void main(String[] args) {
		int val[] = new int[] { 160, 18, 130 };
		int wt[] = new int[] { 13, 20, 36 };
		int W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}

