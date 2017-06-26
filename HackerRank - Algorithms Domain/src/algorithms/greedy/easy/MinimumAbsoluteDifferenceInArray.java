package algorithms.greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int min = arr[N-1];
        for(int i = 0; i < N - 1 ; i++) {
            int diff = Math.abs(arr[i] - arr[i+1]);
            if(diff <= min) {
                min = diff;
            }
        }
        System.out.println(min);
    }
}
