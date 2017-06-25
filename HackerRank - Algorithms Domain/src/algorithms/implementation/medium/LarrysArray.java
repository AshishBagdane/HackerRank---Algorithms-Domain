package algorithms.implementation.medium;

import java.util.Scanner;

public class LarrysArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            
            if(isSorted(a)==-1) {
                System.out.println("NO");
            }else{
                int count[] = new int[n];
                int countSum = 0;
                for(int i=0;i<n;i++) {
                    countSum += count[i] = getLessThanCount(a, i);
                }
                System.out.println((countSum%2==0) ? "YES" : "NO");
            }
        }
        sc.close();
    }
    
    static int isSorted(int[] a) {
        for(int i=0;i<a.length-1;i++) {
            if(a[i]>a[i+1]) {
                return i;
            }
        }
        return -1;
    }
    
    static int getLessThanCount(int[] a, int index) {
        int count = 0;
        for(int i=index+1;i<a.length;i++) {
            if(a[i]<a[index]) {
                count++;
            }
        }
        return count;
    }
}
