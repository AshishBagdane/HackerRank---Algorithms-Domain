package algorithms.search.easy;

import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[1000010];
        for(int i=0;i<n;i++) {
            num[sc.nextInt()]++;
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++) {
            num[sc.nextInt()]--;
        }
        for(int i=0;i<1000010;i++) {
            if(num[i]!=0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
	}
}
