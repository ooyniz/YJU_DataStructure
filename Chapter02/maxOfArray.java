public class maxOfArray {

	static int maxOf(int[] arr) {
		int max;
		max = arr[0];
		
		System.out.print(max + " ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i + 1] + " ");
			if (arr[i + 1] > max)
				max = arr[i + 1];
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int a[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			a[i] = rand.nextInt(100);
		}

		System.out.printf("\n최대값은 %d입니다.", maxOf(a));
	}

}
