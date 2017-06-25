package algorithms.implementation.easy;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++) {
            int pos = (i+k) % n;
            num[pos] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<q;i++) {
            System.out.println(num[sc.nextInt()]);
        }
	}
}
