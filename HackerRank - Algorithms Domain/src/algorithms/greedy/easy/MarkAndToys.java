package algorithms.greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prooducts = new int[n];
        int k = sc.nextInt();
        
        for(int i=0;i<n;i++) {
            prooducts[i] = sc.nextInt();
        }
        
        int cnt = 0;
        int sum = 0;
        int index = 0;
        
        Arrays.sort(prooducts);
        
        while(sum<=k && index<n) {
            sum += prooducts[index++];
            cnt++;
        }
        
        System.out.println(cnt-1);
        sc.close();
    }
}
