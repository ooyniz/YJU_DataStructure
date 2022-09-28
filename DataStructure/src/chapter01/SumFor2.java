package chapter01;

import java.util.*;

public class SumFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("1부터 n까지의 합을 구합니다.");
		do {
			System.out.print("n 입력: ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
