class TicTacToe {

	public String tictactoe(int[][] moves) {

		int[] wins = {
			0b000000111, 0b000111000, 0b111000000,
			0b001001001, 0b010010010, 0b100100100,
			0b100010001, 0b001010100 };

		boolean isA = true;
		int p = ~0, w = 0;
		for (int[] m : moves) {

			int flag = 1 << m[0] + m[1] * 3;
			p ^= flag;
			if (isA)
			w |= flag;
			
			for (int win : wins)

				if ((p & win) == 0) {

					int wWin = w & win;
					if (wWin == win || wWin == 0)
					return isA ? "A" : "B";
				}

			isA = !isA;
		}

		return moves.length == 9 ? "Draw" : "Pending";
	}

	public static void main(String[] args) {

		int[][] num = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
		System.out.println(tictactoe(num));
	}
}