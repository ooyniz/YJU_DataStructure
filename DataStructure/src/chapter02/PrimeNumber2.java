package chapter02;

public class PrimeNumber2 {

	public static void main(String[] args) {
		method01();
		method02(); // 홀수만 검사
		method03(); // 자신보다 작은 소수로 나누어 떨어지지 않으면 소수
	}

	private static void method01() {
		int counter = 0;
		int n, i, j;
		boolean isPrime;
		for (i = 0; i < 999; i++) {
			n = i + 2;
			isPrime = true;
			for (j = 0; j < n - 2; j++) {
				counter++;
				if (n % (j + 2) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				System.out.print(n + ", ");
		}
		System.out.println("\n나눗셈을 수행한 횟수: " + counter);
	}

	private static void method02() {
		int counter = 0;
		int i, j;
		boolean isPrime;
		System.out.print(2 + ", ");
		for (i = 3; i < 1000; i = i + 2) {
			isPrime = true;
			for (j = 0; j < i - 2; j++) {
				counter++;
				if (i % (j + 2) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				System.out.print(i + ", ");
		}
		System.out.println("\n나눗셈을 수행한 횟수: " + counter);
	}

	private static void method03() {
		int[] prime = new int[500]; // 소수를 저장할 배열
		int ptr = 0; // 저장된 소수의 개수
		int counter = 0;
		int i, j;
		boolean isPrime;
		
		// 초기에 2를 소수배열에 넣는다.
		prime[ptr++] = 2;
		
		for (i = 3; i < 1000; i = i + 2) {
			isPrime = true;
			for (j = 0; j < ptr; j++) {
				counter++;
				if (i % prime[j] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime[ptr++] = i;
			}
		}
		for (i = 0; i < ptr; i++) {
			System.out.print(prime[i] + ", ");
		}
		System.out.println("\n나눗셈을 수행한 횟수: " + counter);
	}
	
}
