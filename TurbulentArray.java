class TurbulentArray { 

	public int counter = 0;
	public int temp = 0;
	public int[] arr = {1,5,5,1,5,2,3,3,1,2};

	public void check(int i) {

		if (i < arr.length - 1){

			if (arr[i] > arr[i + 1])
				checkGreater(i);
			else if (arr[i] < arr[i + 1])
				checkLesser(i);
			else
				check(i + 1);
		}
	}

	public void checkGreater(int i) {

		if (i < arr.length - 1 && arr[i] > arr[i + 1]) {

			counter++;
			checkLesser(i + 1);
		}
		else {

			if (counter > temp)
				temp = counter;
			counter = 0;
			check(i + 1);
		}
	}

	public void checkLesser(int i) {

		if (i < arr.length - 1 && arr[i] < arr[i + 1]) {

			counter++;
			checkGreater(i + 1);
		}
		else {

			if (counter > temp)
				temp = counter;
			counter = 0;
			check(i + 1);
		}
	}

	public static void main(String[] args) {

		TurbulentArray ta = new TurbulentArray();
		ta.check(0);
		System.out.println(ta.temp);
	}
}