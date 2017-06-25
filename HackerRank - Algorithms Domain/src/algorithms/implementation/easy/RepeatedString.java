package algorithms.implementation.easy;

import java.util.Scanner;

public class RepeatedString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long n = sc.nextLong();
        int cnt_str = 0;
        for(char ch : str.toCharArray()) {
            cnt_str += (ch=='a') ? 1 : 0;
        }
        sc.close();
        String rem = str.substring(0, (int)(n%str.length()));
        int cnt_rem = 0;
        for(char ch : rem.toCharArray()) {
            cnt_rem += (ch=='a') ? 1 : 0;
        }
        System.out.println(((n/str.length()) * cnt_str) + cnt_rem);
    }
}
