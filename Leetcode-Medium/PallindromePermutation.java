import java.util.*;

public class PallindromePermutation {
	public static boolean palinPerm(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (char c : str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		al.addAll(hm.values());
		int count = 0;
		for (char key : hm.keySet()) {
			count += hm.get(key) % 2;
		}
		System.out.println(count);
		return count <= 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aab";
		System.out.println(palinPerm(str));
	}

}
