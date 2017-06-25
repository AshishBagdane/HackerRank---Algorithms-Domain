package algorithms.implementation.easy;

import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        int[] count = new int[101];
        for(int i=1;i<=n;i++) {
            count[sc.nextByte()]++;
        }
        sc.close();
        int maxCount = Integer.MIN_VALUE;
        int nDeletions = 0;
        for(int i=1;i<count.length;i++) {
            if(count[i]>maxCount) {
                maxCount = count[i];
            }
            nDeletions += count[i];
        }
        System.out.println(nDeletions - maxCount);
	}
}
