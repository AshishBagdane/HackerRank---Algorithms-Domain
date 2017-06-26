package algorithms.dynamicprogramming.medium;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciModified {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fibseries(n));
        System.out.println(fibSeries(n, new HashMap<>()));
        sc.close();
    }
    
    // Using simple memoization
    static long fibSeries(long n, HashMap<Long, Long> memo) {
        if(memo.get(n)!=null) {
            return memo.get(n);
        }else if(n<=2) {
            return 1;
        }else{
            long value = fibSeries(n-1, memo) + fibSeries(n-2, memo);
            memo.put(n, value);
            return value;
        }
    }
    
    // Using Bottom Up Approach DP
    static long fibseries(long n) {
        HashMap<Long, Long> fibonacci = new HashMap<>();
        fibonacci.put(1L, 1L);
        fibonacci.put(2L, 1L);
        for(long i = 3;i<=n;i++) {
            fibonacci.put(i, fibonacci.get(i-1) + fibonacci.get(i-2));
        }
        return fibonacci.get(n);
    }
}
