class MaxBalloon {

	public static void main(String[] args) {

		String solve = "nlaebolko";
		String str = solve.toLowerCase();
		int b = 0; // 1
		int a = 0; // 1
		int l = 0; // 2
		int o = 0; // 2
		int n = 0; // 1
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {

			switch (str.charAt(i)) {

				case 'b':
					b++;
					break;
				case 'a':
					a++;
					break;
				case 'l':
					l++;
					break;
				case 'o':
					o++;
					break;
				case 'n':
					n++;
					break;
			}
		}

		System.out.println(b + " " + a + " " + l + " " + o + " " + n);

		while (l >= 2 && o >= 2 && b >= 1 && a >= 1 && n >= 1) {

			l -= 2;
			o -= 2;
			b--;
			a--;
			n--;
			count++;
		}

		System.out.println("Number of balloon(s) are: " + count);
	}
}