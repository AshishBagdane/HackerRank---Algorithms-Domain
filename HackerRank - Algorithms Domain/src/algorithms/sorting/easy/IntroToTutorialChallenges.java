package algorithms.sorting.easy;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        if((n>=1 && n<=1000) && (V>=-1000 && V<=1000)) {
                int i;
                for(i=0;i<n;i++) {
                    num[i] = sc.nextInt();
                    if(num[i]==V)
                        break;
                }
                System.out.println(i);
        }
        sc.close();
	}
}
