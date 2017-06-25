package algorithms.implementation.easy;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[] arrA = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
			if (arrA[i] < min) {
				min = arrA[i];
			}
		}
		int max = Integer.MIN_VALUE;
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
			arrB[i] = sc.nextInt();
			if (arrB[i] > max) {
				max = arrB[i];
			}
		}
		sc.close();
		int count = 0;
		for (int x = min; x <= max; x++) {
			if (isFactor(x, arrA) && isFactor(arrB, x)) {
				count++;
			}
		}
		System.out.println(count);
	}

	static boolean isFactor(int[] arrB, int x) {
		for (int number : arrB) {
			if (number % x != 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isFactor(int x, int[] arrA) {
		for (int number : arrA) {
			if (x % number != 0) {
				return false;
			}
		}
		return true;
	}
}
