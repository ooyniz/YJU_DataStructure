package chapter02;

import java.util.Scanner;

public class CardConv {

	static int cardConv(int x, int r, char[] d) {
		// x = 변환할 정수값, r = 기수, d = 실제 결과값이 있는 배열
		int digits = 0; // 변환 뒤 자릿수, 첨자 표시 용도
		String dchar = "0123456789ABCEKFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}

		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no, dno, retry;
		// int  cd;
		char[] cno = new char[32];
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = sc.nextInt();
			} while (no < 0);

//			do {
//				System.out.println("어떤 진수로 변환할까요? (2-36): ");
//				cd = sc.nextInt();
//			} while (cd < 2 || cd>36);

			dno = cardConv(no, 2, cno);
			System.out.print(2 + "진수로 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");

			dno = cardConv(no, 8, cno);
			System.out.print(8 + "진수로 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");

			dno = cardConv(no, 16, cno);
			System.out.print(16 + "진수로 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");

			System.out.println("다시 한 번 할까요? (1.. 예/0.. 아니오)");
			retry = sc.nextInt();
		} while (retry == 1);
		sc.close();
	}

}
