package algorithms.implementation.easy;

import java.util.Scanner;

public class SherlockAndSquares {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            long A = sc.nextInt();
            long B = sc.nextInt();
            System.out.println(((int)Math.floor(Math.sqrt(B))-(int)Math.ceil(Math.sqrt(A)))+1);
        }
        sc.close();
    }
}
