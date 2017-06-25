package algorithms.strings.medium;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndAnagrams {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0) {
            String main = sc.next();
            int count = 0;
            for(int len=1;len<=main.length();len++) {
                for(int i=0;i<main.length()-len;i++) {
                    int j = i+len;
                    for(int k=i+1;k<main.length()-len+1;k++) {
                        if(isAnagram(main.substring(i, j), main.substring(k, k+len))) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
    
    static boolean isAnagram(String a, String b) {
        char[] arrA = a.toCharArray();
        Arrays.sort(arrA);
        char[] arrB = b.toCharArray();
        Arrays.sort(arrB);
        for(int i=0;i<a.length();i++) {
            if(arrA[i]!=arrB[i]) {
                return false;
            }
        }
        return true;
    }
}
