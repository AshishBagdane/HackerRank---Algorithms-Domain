package algorithms.greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextByte();
        while(t--!=0) {
            int n = sc.nextByte();
            sc.nextLine();
            char[][] str = new char[n][n];
            for(int i=0;i<n;i++) {
                str[i] = sc.next().toCharArray();
                Arrays.sort(str[i]);
            }
            System.out.println(isSorted(str));
        }
        sc.close();
    }
    
    static String isSorted(char[][] str) {
        for(int i=0;i<str[0].length;i++) {
            for(int j=0;j<str[0].length;j++) {
                if(str[0][i]>str[j][i]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
