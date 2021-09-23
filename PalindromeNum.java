class PalindromeNum {

	int x = 626;

	public boolean isPalindrome() {

		int num = this.x;
		boolean is_palindrome;
		String check = "";

		if (num < 0) {

			is_palindrome = false;
		}
		else {

			while (num > 0) {

				check += num % 10;
				num /= 10;
			}

			int result = Integer.parseInt(check);
			if (result == this.x) {

				is_palindrome = true;
			}
			else {


				is_palindrome = false;
			}
		}

		return is_palindrome;
	}

	public static void main(String[] a) {

		PalindromeNum obj = new PalindromeNum();
		System.out.println(obj.isPalindrome());
	}
}