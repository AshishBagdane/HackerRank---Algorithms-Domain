package algorithms.implementation.easy;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while(T--!=0) {
            char[] num = sc.next().toCharArray();
            long n = Long.parseLong(new String(num));
            int count = 0;
            for(int i=0;i<num.length;i++) {
                if(num[i]!='0' && n%Character.getNumericValue(num[i])==0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
	}
}
