import java.util.*;

public class Combinations {
	public static ArrayList<ArrayList<Integer>> normalCombinations(int n, int k) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if (n <= 0 || n < k) {
			// list.add(new ArrayList<Integer>(temp));
			return list;
		}
		List<Integer> temp = new ArrayList<Integer>();
		helper(list, temp, n, k, 1);
		return list;
	}

	private static void helper(ArrayList<ArrayList<Integer>> list, List<Integer> temp, int n, int k, int start) {

		if (temp.size() == k) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		for (int i = start; i <= n; i++) {
			temp.add(i);
			helper(list, temp, n, k, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		System.out.println(normalCombinations(n, k));
	}

}
