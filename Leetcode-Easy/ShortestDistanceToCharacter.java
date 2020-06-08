import java.util.Arrays;

public class ShortestDistanceToCharacter {
	public static String shortestDistance(String S, char C) {
		char[] arr = S.toCharArray();
		int[] result = new int[S.length()];
		int disttoL = S.length();
		int disttoR = S.length();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == C)
				disttoL = 0;
			result[i] = disttoL;
			disttoL++;
		}
		// System.out.println(Arrays.toString(result));
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == C)
				disttoR = 0;
			result[i] = Math.min(result[i], disttoR);
			disttoR++;
		}
		return Arrays.toString(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "loveleetcode";
		char C = 'e';
		System.out.println(shortestDistance(str, C));
	}
}
