package algorithms.implementation.easy;

import java.util.Scanner;

public class PickingNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100];
        for(int i = 0; i < N; i++) {
            arr[sc.nextInt()]++;
        }
        sc.close();
        int max = 0;
        for(int i = 1; i < N; i++) {
            int count = arr[i-1] + arr[i];
            if(max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
