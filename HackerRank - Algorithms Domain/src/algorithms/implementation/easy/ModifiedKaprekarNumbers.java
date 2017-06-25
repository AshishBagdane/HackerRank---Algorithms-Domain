package algorithms.implementation.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long from = sc.nextInt();
        long to = sc.nextInt();
        sc.close();
        List<Long> kaprekarNumbers = new ArrayList<>();
        
        for(long i=from;i<=to;i++) {
            long kaprekarNumber = isKaprekar(i);
            if(kaprekarNumber!=-1) {
                kaprekarNumbers.add(kaprekarNumber);
            }
        }
        
        if(kaprekarNumbers.isEmpty()) {
            System.out.print("INVALID RANGE");
        }else{
            kaprekarNumbers.stream().forEach((number) -> {
                System.out.print(number + " ");
            });
        }
    }
    
    static long isKaprekar(long n) {
        if(n==1) {
            return n;
        }
        BigInteger numSqr = new BigInteger(n * n + "");
        int[] num = getArray(numSqr);
        int sz = num.length;
        int mid = sz/2;
        
        if(sz!=0) {
            BigInteger n1 = getNumber(num, mid, sz-1, sz);
            BigInteger n2 = getNumber(num, 0, mid-1, sz-mid);
            return (n1.add(n2).compareTo(new BigInteger(n + ""))==0) ? n : -1;
        }else{
            return -1;
        }
    }
    
    static int[] getArray(BigInteger n) {
        ArrayList<Integer> num = new ArrayList<>();
        
        while(n.compareTo(BigInteger.ZERO)!=0) {
            num.add(n.mod(BigInteger.TEN).intValue());
            n = n.divide(BigInteger.TEN);
        }
        
        int[] result = new int[num.size()];
        int sz = num.size()-1;
        for(int i=0;i<=sz;i++) {
            result[i] = num.get(sz-i);
        }
        return result;
    }
    
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    static BigInteger getNumber(int[] num, int start, int end, int size) {
        if(size==1) {
            return new BigInteger(num[0] + "");
        }else{
            BigInteger n = new BigInteger(num[end] + "");
            int j = 1;
            for(int i=end-1;i>=start;i--) {
                BigInteger tenPower = BigInteger.valueOf((long)Math.pow(10, j++));
                n = n.add(new BigInteger(num[i] + "").multiply(tenPower));
            }
            return n;
        }
    }
}
