import java.util.*;

public class ShortEncodingOfWords {
	public static int encode(String[] str) {
		String resString = "";
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i].endsWith(str[i + 1])) {
				resString = str[i].concat("#");
			} else {
				str[i] = str[i + 1].concat("#");
				resString += str[i];
			}

		}
		
		return resString.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "time", "me", "bell" };
		System.out.println(encode(words));
	}

}
