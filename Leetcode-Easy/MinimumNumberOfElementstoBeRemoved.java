import java.util.*;

public class MinimumNumberOfElementstoBeRemoved {
	public static int minimumNUmber(int[] arr, int k) {
		if (arr.length == 1 && arr[0] == k) {
			return 0;
		}
		int n = arr.length;
		int i = 0, j = 0;
		int min = Integer.MAX_VALUE;
		boolean found = false;
		int sum = 0;
		while (i < n) {
			sum += arr[i];
		}
		if (sum == k) {
			min = Math.min(min, ((n - (i + 1)) + j));
			found = true;
		} else if (sum > k) {
			while (sum > k) {
				sum = sum - arr[j];
				j++;
			}
			if (sum == k) {
				min = Math.min(min, ((n - (i + 1)) + j));
				found = true;
			}
		}
		i++;
		if (found)
			return min;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
