package algorithms.implementation.easy;

import java.util.Scanner;

public class FairRatios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += num[i] = sc.nextInt();
        }
        sc.close();
        if(sum%2==1) {
            System.out.println("NO");
        }else{
            int count = 0;
            int i;
            for(i=0;i<n-1;i++) {
                if(num[i]%2!=0) {
                    num[i]++;
                    num[i+1]++;
                    count += 2;
                }
            }
            if(num[i]%2!=0) {
                num[i]++;
                num[i-1]++;
                count += 2;
            }
            System.out.println(count);
        }
    }
}
