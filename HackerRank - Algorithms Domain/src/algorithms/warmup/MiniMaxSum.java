package algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long[] numbers = new long[5];
        for(int i=0;i<5;i++) {
            numbers[i] = sc.nextLong();
        }
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i=0;i<5;i++) {
            long sum = 0;
            for(int j=0;j<5;j++) {
                if(i!=j) {
                    sum += numbers[j];
                }
            }
            if(sum>max) {
                max = sum;
            }
            if(sum<min) {
                min = sum;
            }
        }
        sc.close();
        System.out.println(min + " " + max);
	}
}
