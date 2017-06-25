package algorithms.strings.easy;

import java.util.Scanner;

public class FunnyString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            System.out.println(checkFunny(sc.next().toCharArray()));
        }
        sc.close();
    }
    
    static String checkFunny(char[] str) {
        for(int i=1;i<str.length;i++) {
            if(Math.abs(str[i]-str[i-1])!=Math.abs(str[str.length-i]-str[str.length-(i+1)])) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}