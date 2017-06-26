package algorithms.bitmanipulation.medium;

import java.util.Scanner;

public class XORSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while (Q-- != 0) {
			long L = sc.nextLong();
			long R = sc.nextLong();
			System.out.println(getValue(R) ^ getValue(L - 1));
		}
		sc.close();
	}

	static long getValue(long x) {
		int a = (int) (x % 8);
		switch (a) {
		case 0:
		case 1:
			return x;
		case 2:
		case 3:
			return 2;
		case 4:
		case 5:
			return x + 2;
		case 6:
		case 7:
			return 0;
		default:
			return 0;
		}
	}
}
