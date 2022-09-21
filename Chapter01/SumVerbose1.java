import java.util.*;

public class SumVerbose1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum;
		sum = 0;

		do {
			n = sc.nextInt();
		} while (n <= 0);

		sc.close();

//		for (int i = 0; i <= n; i++) {
//			if (i == 0) continue;
//			if (i < n)
//				System.out.print(i + " + ");
//			else
//				System.out.print(i + " = ");
//
//			sum += i;
//		}

		// 조건식이 없어짐 -> 효율적
		for (int i = 0; i < n - 1; i++) {
			System.out.print((i + 1) + " + ");
			sum += (i + 1);
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
	}

}
