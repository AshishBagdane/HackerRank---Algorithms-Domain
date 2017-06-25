package algorithms.implementation.easy;

import java.util.Scanner;

public class MinimumDistances {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(i!=j && num[i]==num[j]) {
                    int distance = Math.abs(i - j);
                    if(distance<=min) {
                        min = distance;
                    }
                }
            }
        }
        System.out.println(min);
    }
}
