import java.util.Arrays;

class MedianSorted {

	static double checkMedian(int[] num) {

		if (num.length % 2 == 0) {

			int add = num[num.length / 2] + num[num.length / 2 - 1];
			return (double) add / 2;
		} 
		else {

			return num[(int) num.length / 2];
		}
	}

	public static void main(String[] args) {

		int[] num1 = {1,2,5,7,1,2};
		int[] num2 = {92,2,15,63,24};
		int[] num3 = new int[num1.length + num2.length];
		
		for (int i = 0; i < num1.length; i++)
			num3[i] = num1[i];

		int j = 0;
		for (int i = num1.length; i < num3.length; i++) {

			num3[i] = num2[j];
			j++;
		}

		Arrays.sort(num3);

		for (int i = 0; i < num3.length; i++)
			System.out.print(num3[i] + " ");

		double result = checkMedian(num3);
		System.out.println("\nThe median is: " + result);
	}
}