package algorithms.implementation.easy;

import java.util.Scanner;

public class TheHurdleRace {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int hurdleHeight = sc.nextInt();
			if (max < hurdleHeight) {
				max = hurdleHeight;
			}
		}
		sc.close();
		int difference = max - K;
		System.out.println((difference > 0) ? difference : 0);
    }
}
