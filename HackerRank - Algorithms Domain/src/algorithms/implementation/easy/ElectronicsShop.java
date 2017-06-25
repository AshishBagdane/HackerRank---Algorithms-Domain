package algorithms.implementation.easy;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] keyboards = new int[n];
        for(int i = 0; i < n; i++) {
            keyboards[i] = sc.nextInt();
        }
        sc.close();
        int maximalCost = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++) {
            int usbDrive = sc.nextInt();
            for(int j = 0; j < n; j++) {
                int totalCost = keyboards[j] + usbDrive;
                if(totalCost <= s && totalCost > maximalCost) {
                    maximalCost = totalCost;
                }
            }
        }
        System.out.println((maximalCost == Integer.MIN_VALUE) ? -1 : maximalCost);
	}
}
