class MaxConsecutive {

	public static int findMaxConsecutiveOnes(int[] nums) {

		int counter = 0;
		int max = counter;
		for (int i: nums) {
			if (i == 1) {
				counter++;
			}
			else {

				if (max < counter)
					max = counter;
				counter = 0;
			}
		}
		if (max < counter)
			max = counter;
		return max;
	}

	public static void main(String[] args) {

		int[] nums = {1,1,1,1,1,1,1,0,0,1,1};
		System.out.print(findMaxConsecutiveOnes(nums));
	}
}