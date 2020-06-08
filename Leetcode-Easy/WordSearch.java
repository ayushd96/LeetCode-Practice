
public class WordSearch {
	static boolean isVisited[][];

	public static boolean exist(char[][] board, String word) {
		isVisited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (word.charAt(0) == board[i][j] && helpSearch(board, word, i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean helpSearch(char[][] board, String word, int i, int j, int index) {
		if (index == word.length()) {
			return true;
		}

		// base cases..
		if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index)
				|| isVisited[i][j]) {
			return false;
		}
		if (helpSearch(board, word, i - 1, j, index + 1) || helpSearch(board, word, i + 1, j, index + 1)
				|| helpSearch(board, word, i, j - 1, index + 1) || helpSearch(board, word, i, j + 1, index + 1)) {

			return true;
		}
		isVisited[i][j] = false;
		return false;
	}

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String str = "SEE";
		System.out.println(exist(board, str));

	}

}
