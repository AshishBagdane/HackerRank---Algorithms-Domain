package algorithms.implementation.easy;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int bestScore, worstScore, bestBreakCount, worstBreakCount;
        bestScore = worstScore = sc.nextInt();
        bestBreakCount = worstBreakCount = 0;
        for(int i = 1; i < N; i++) {
            int score = sc.nextInt();
            if(score > bestScore) {
                bestScore = score;
                bestBreakCount++;
            }else if(score < worstScore) {
                worstScore = score;
                worstBreakCount++;
            }
        }
        sc.close();
        System.out.println(bestBreakCount + " " + worstBreakCount);
	}
}
