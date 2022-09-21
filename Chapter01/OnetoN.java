import java.util.*;

public class OnetoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum, i, n;
		sum = 0;
		i = 1;
		n = sc.nextInt();
		sc.close();
		while (i <= n) {
			sum += i;
			i += 1;
		}
		System.out.println(sum);
	}

}
