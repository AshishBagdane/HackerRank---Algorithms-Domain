package algorithms.search.medium;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(getRequiredPairsCount(arr, k));
        
        sc.close();
    }
    
    static int getRequiredPairsCount(int[] a, int k) {
        int cnt = 0;
        int i = 0, j = 1;
        
        while(j<a.length) {
            int diff = a[j] - a[i];
            if(diff==k) {
                cnt++;
                j++;
            }else if(diff>k) {
                i++;
            }else {
                j++;
            }
        }
        
        return cnt;
    }
}
