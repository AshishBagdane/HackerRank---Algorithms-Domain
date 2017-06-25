package algorithms.implementation.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        System.out.println(fact(n));
        sc.close();
    }
    
    static BigInteger fact(BigInteger n) {
        return (n.compareTo(BigInteger.ZERO)==0 || n.compareTo(BigInteger.ONE)==0) ? BigInteger.ONE : n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
}
