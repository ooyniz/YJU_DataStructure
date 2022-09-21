import java.util.*;

public class Stars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count;
		n = 5;
		// n 입력
//		do {
//			System.out.print("n 입력: ");
//			n = sc.nextInt();
//		} while (n <= 0);
		sc.close();

		System.out.println("직각 삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("거꾸로 직각 삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("+2 직각 삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("+2 거꾸로 직각 삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < (n - i) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("정삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("거꾸로 정삼각형");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("마름모");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%d	", i + n);
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i) * 2 - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("마름모 두 개");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (n - i - 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%d	", i + n);
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i) * 2 - 3; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (i + 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i) * 2 - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");

		System.out.println("마름모 열 개");
		count = 10;
		for (int i = 0; i < n; i++) {
			System.out.printf("%d	", i);
			for (int k = 0; k < count; k++) {
				for (int j = 0; j < n - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i * 2) + 1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < n - i - 1; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%d	", i + n);
			for (int k = 0; k < count; k++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (n - i) * 2 - 3; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("");

	}

}
