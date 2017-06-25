package algorithms.implementation.medium;

import java.util.Scanner;

public class AbsolutePermutation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i : permute(n, k)) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    static int[] permute(int n, int k) {
        int[] res = new int[n];
        for(int i=0;i<n;i++) {
            res[i] = i+1;
        }
        for(int i=0;i<k;i++) {
            for(int j=i;j<n;j+=2*k) {
                if(j+k>=n)
                    return new int[]{-1};
                int temp = res[j];
                res[j] = res[j+k];
                res[j+k] = temp;
            }
        }
        return res;
    }
}
