class ArrayIntersection {

	public int[] intersect(int[] num1, int[] num2) {

        int[] f1 = new int[1001];
        int[] f2 = new int[1001];
        
        for(int x : num1) f1[x]++;
        for(int x : num2) f2[x]++;
        
        int count = 0;
        for(int i = 0; i <= 1000; i++) { 
            f2[i] = Math.min(f1[i], f2[i]); 
            count+=f2[i];
        }
        
        if(count == 0) return new int[]{};
        int[] res = new int[count];
        int index = 0;
        for(int i = 0; i <= 1000; i++)
            while(f2[i]-- > 0) res[index++] = i;
        
        return res;
	}

	public static void main(String[] args) {

		ArrayIntersection obj = new ArrayIntersection();
		int[] num1 = {1,2,3};
		int[] num2 = {2,4};
		for (int i: obj.intersect(num1, num2))
			System.out.print(i + " ");
	}
}