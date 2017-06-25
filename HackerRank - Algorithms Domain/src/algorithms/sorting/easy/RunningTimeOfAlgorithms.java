package algorithms.sorting.easy;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();
        insertionSort(num);
        sc.close();
    }
    
    static void insertionSort(int[] num) {
        int key = 0, i, count = 0;
        for(int j=1;j<num.length;j++) {
            key = num[j];
            i = j-1;
            while(i>=0 && num[i]>key) {
                num[i+1] = num[i];
                count++;
                i--;
            }            
            num[i+1] = key;
        }
        System.out.println(count);
    }
}
