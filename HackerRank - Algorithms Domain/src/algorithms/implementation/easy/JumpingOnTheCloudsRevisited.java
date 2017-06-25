package algorithms.implementation.easy;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] clouds = new int[n];
        for(int i=0;i<n;i++) {
            clouds[i] = sc.nextInt();
        }
        sc.close();
        int E = 100;
        int i = 0;
        while(true) {
            i += k;
            i %= n;
            E -= (clouds[i]==0) ? 1 : 3;
            if(i==0) {
                break;
            }
        }
        System.out.println(E);
	}
}
