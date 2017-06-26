package algorithms.bitmanipulation.easy;

import java.util.Scanner;

public class SumVsXOR {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count = 0;
		while (n != 0) {
			count += (n % 2 == 0) ? 1 : 0;
			n /= 2;
		}
		count = (long) Math.pow(2, count);
		System.out.println(count);
		sc.close();
    }
}
