import java.util.*;

public class RobotReturnOrigin {
	public static boolean robotReturntoOrigin(String moves) {
		if (moves.isEmpty()) {
			return true;
		}
		int left = 0;
		// int right = 0;
		int up = 0;
		// int down = 0;
		for (int i = 0; i < moves.length(); i++) {
			if (moves.charAt(i) == 'U')
				up++;
			if (moves.charAt(i) == 'D')
				up--;
			if (moves.charAt(i) == 'L')
				left++;
			if (moves.charAt(i) == 'R')
				left--;
		}
		if (up == 0 && left == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String moves = s.nextLine().toUpperCase();
		System.out.println(robotReturntoOrigin(moves));
		s.close();
	}

}
