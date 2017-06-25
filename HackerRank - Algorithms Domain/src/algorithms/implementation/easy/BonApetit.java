package algorithms.implementation.easy;

import java.util.Scanner;

public class BonApetit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int except = sc.nextInt();
		int cost[] = new int[n];
		int actualCost = 0;

		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
			actualCost += (i != except) ? cost[i] : 0;
		}
		actualCost /= 2;
		int chargedCost = sc.nextInt();

		if (chargedCost - actualCost == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(chargedCost - actualCost);
		}

		sc.close();
	}
}
