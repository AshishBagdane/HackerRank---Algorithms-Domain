package algorithms.greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            System.out.println(getLargestDecent(sc.nextInt()));
        }
        sc.close();
    }
    
    static String getLargestDecent(int n) {
        char[] decentNumber = new char[n];
        int index = getLast5Index(n);
        if(index==-1)
            return "-1";
        Arrays.fill(decentNumber, 0, index, '5');
        Arrays.fill(decentNumber, index, n, '3');
        return new String(decentNumber);
    }
    
    static int getLast5Index(int n) {
        int z=n; 
        while(z%3!=0){ 
            z-=5; 
            if(z<0)
                return -1; 
        }
        return z;
    }
}
