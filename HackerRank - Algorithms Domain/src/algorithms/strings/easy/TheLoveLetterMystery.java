package algorithms.strings.easy;

import java.util.Scanner;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            char[] word = sc.next().toCharArray();
            int count = 0;
            for(int i=0;i<word.length/2;i++) {
                count+=Math.abs(word[i]-word[(word.length-i-1)]);
            }
            System.out.println(count);
        }
        sc.close();
    }
}
