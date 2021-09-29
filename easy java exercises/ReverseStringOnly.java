import java.lang.StringBuilder;

class ReverseStringOnly {

	public static void main(String[] args) {

		String given = "ac=dc-ef0gh|ij";
		String str = "";
		for (int i = given.length() - 1; i >= 0; i--) {

			if (!Character.isLetter(given.charAt(i)))
				continue;
			else
				str += given.charAt(i);
		}

		System.out.println(given);
		for (int i = 0; i < given.length(); i++) {

			if (!Character.isLetter(given.charAt(i)))
				str = new StringBuilder(str).insert(i, given.charAt(i)).toString();
			else
				continue;
		}

		System.out.println(str);
	}
}