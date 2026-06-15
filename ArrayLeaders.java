class Solution {
	static ArrayList<Integer> leaders(int arr[]) {
		// code here
		int n = arr.length;
		ArrayList<Integer> res = new ArrayList<>();
		int maxRight = arr[n - 1];
		res.add(arr[n-1]);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] >= maxRight) {
				maxRight = arr[i];
				res.add(maxRight);
			}
		}
		Collections.reverse(res);
		return res;
	}
}
