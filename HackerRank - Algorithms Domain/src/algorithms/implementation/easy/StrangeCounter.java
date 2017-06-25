package algorithms.implementation.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger time = sc.nextBigInteger();
        BigInteger value = new BigInteger("3");
        BigInteger two = value.subtract(BigInteger.ONE);
        BigInteger three = value;
        int i = 1;
        while(time.compareTo(value)==1) {
            BigInteger v = (two.pow(i++));
            value = three.multiply(v.subtract(BigInteger.ONE));
        }
        sc.close();
        System.out.println(value.subtract(time).add(BigInteger.ONE));
	}
}
