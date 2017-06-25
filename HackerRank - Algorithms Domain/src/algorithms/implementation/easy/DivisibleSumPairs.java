package algorithms.implementation.easy;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++) {
            num[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i<j && (num[i]+num[j])%k==0) {
                    count++;
                }
            }
        }
        sc.close();
        System.out.println(count);
	}
}
