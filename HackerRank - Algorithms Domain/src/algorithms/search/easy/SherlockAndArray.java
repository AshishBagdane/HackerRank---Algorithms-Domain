package algorithms.search.easy;

import java.util.Scanner;

public class SherlockAndArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases--!=0) {
            int n = sc.nextInt();
            int[] num = new int[n];
            int rightSum = 0;
            for(int i=0;i<n;i++) {
                rightSum += num[i] = sc.nextInt();
            }
            System.out.println((n==1) ? "YES" : getMidIndex(num, rightSum));
        }
        sc.close();
    }
    
    static String getMidIndex(int num[],int rightSum) {
        int leftSum = 0;
        rightSum -= num[0];
        for(int lowIndex = 0, midIndex = 1;midIndex<num.length-1;lowIndex++ ,midIndex++) {
            rightSum -= num[midIndex];
            leftSum += num[lowIndex];
            if(leftSum==rightSum)
                return "YES";
        }
        return "NO";
    }
}
