public class Multi99Table {

	public static void main(String[] args) {

		for (int i = 0; i < 33; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.printf("%3d * %d = %3d	", 3 * i + (k + 2), (j + 1), (3 * i + (k + 2)) * (j + 1));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
