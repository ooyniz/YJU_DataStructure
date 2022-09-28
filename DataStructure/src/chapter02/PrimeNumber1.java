package chapter02;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// 2에서 1000까지의 소수 나열하기
		// 2에서 1000까지의 바깥 for문으로 돌기
		// 안쪽 for문에서 2부터 자신의 수 -1까지 나누어서 떨어지면 소수가 아님
		int counter = 0;
		int n, i, j;
//		boolean isPrime;
		for (i = 0; i < 999; i++) {
			n = i + 2;
//			isPrime = true;
			for (j = 0; j < n - 2; j++) {
				counter++;
				if (n % (j + 2) == 0) {
//					isPrime = false;
					break;
				}
			}
			if (j + 2 == n)
				System.out.print(n + ", ");
//			if (isPrime == true)
//				System.out.print(n + ", ");
		}

		System.out.println("\n나눗셈을 수행한 횟수: " + counter);
	}

}
