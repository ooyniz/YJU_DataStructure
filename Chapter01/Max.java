import java.util.*;

public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.println("a, b, c 입력: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println(max);
	}

}
