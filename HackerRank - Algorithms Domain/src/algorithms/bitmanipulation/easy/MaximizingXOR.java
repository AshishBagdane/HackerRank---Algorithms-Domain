package algorithms.bitmanipulation.easy;

import java.util.Scanner;

public class MaximizingXOR {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = L; i <= R; i++) {
			for (int j = i; j <= R; j++) {
				int XOR = i ^ j;
				if (XOR > max) {
					max = XOR;
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}
