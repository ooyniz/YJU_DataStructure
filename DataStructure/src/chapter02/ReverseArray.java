package chapter02;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {

	static int maxOf(int[] arr) {
		int max;
		max = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > max)
				max = arr[i + 1];
		}
		return max;
	} // end of maxOf

	public static void main(String[] args) {
		Random rand = new Random();
		int a[] = new int[7];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		
		// a 배열에 랜덤 값 넣기
		System.out.println("a 배열 출력");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		// 최대값 구하기
		System.out.printf("\n최대값은 %d입니다.\n", maxOf(a));

		reverse(a);

		// 역순 a배열
		System.out.print("a 배열 역순으로 출력 : ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println(); // 줄 바꿈

		// System.out.println("a.toString() : " + a.toString());
		System.out.println("Arrays.toString(a) : " + Arrays.toString(a));

		// 역순으로 정렬
		System.out.println("역순으로 정렬하는 과정");
		reverse1(a);

		System.out.println("\n 모든 요소의 합을 출력");
		sumOf(a);

		System.out.println("\n 모든 요소를 복사");
		int[] c = new int[a.length];
		copy(a, c);
		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("c 배열 : " + Arrays.toString(c));
		
		System.out.println("\n 모든 요소를 역순으로 복사");
		int[] rc = new int[a.length];
		rcopy(a, rc);

		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("rc 배열 : " + Arrays.toString(rc));
	} // end of main

	private static void rcopy(int[] arr, int[] rc) {
		copy(arr, rc);
		reverse(rc);
		
	} // end of rcopy

	private static void copy(int[] arr, int[] c) {

		for (int i = 0; i < arr.length; i++) {
			c[i] = arr[i];
		}
	} // end of copy

	private static void sumOf(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	} // end of sumOf

	private static void reverse1(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			System.out.println(" " + Arrays.toString(arr));
			swap(arr, i, arr.length - i - 1);
		}
		System.out.println("결과 : " + Arrays.toString(arr));
	} // end of reverse1

	// 배열의 원소의 순서를 역순으로 만드는 메소드
	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			// 두 원소의 값을 바꾼다.
			swap(arr, i, arr.length - i - 1);
		}

	} // end of reverse

	// 배열에서 지정한 두 원소의 값을 교환한다.
	private static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} // end of swap

}