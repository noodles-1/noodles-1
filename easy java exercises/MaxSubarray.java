class MaxSubarray {

	public static void main(String[] args) {

		int[] num = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubarray(num));
	}

	public static int maxSubarray(int[] nums) {

		int max = nums[0];
		int current = max;
		for (int i = 1; i < nums.length; i++) {

			current = Math.max(nums[i] + current, nums[i]);
			System.out.println("Current: " + current);
			max = Math.max(current, max);
			System.out.println("Max: " + max);
		}
		return max;
	}
}