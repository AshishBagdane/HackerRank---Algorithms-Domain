package algorithms.bitmanipulation.easy;

import java.util.Scanner;

public class FlippingBits {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T = sc.nextInt();
		while (T-- != 0) {
			long maxInt = (long) Math.pow(2, 32) - 1;
			System.out.println(maxInt ^ sc.nextInt());
		}
		sc.close();
	}
}
