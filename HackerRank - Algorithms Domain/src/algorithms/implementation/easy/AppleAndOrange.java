package algorithms.implementation.easy;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int nApples = sc.nextInt();
		int nOranges = sc.nextInt();

		int countApples = 0, countOranges = 0;

		for (int i = 0; i < nApples; i++) {
			int distanceApple = sc.nextInt();
			if (distanceApple >= 0) {
				int newPosition = a + distanceApple;
				if (newPosition >= s && newPosition <= t) {
					countApples++;
				}
			}
		}

		for (int i = 0; i < nOranges; i++) {
			int distanceOrange = sc.nextInt();
			if (distanceOrange <= 0) {
				int newPosition = b + distanceOrange;
				if (newPosition >= s && newPosition <= t) {
					countOranges++;
				}
			}
		}

		sc.close();

		System.out.println(countApples);
		System.out.println(countOranges);
	}
}
