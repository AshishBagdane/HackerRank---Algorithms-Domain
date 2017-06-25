package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        long primSum = 0, secSum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j)
                    primSum += a[a_i][a_j];
            }
            secSum += a[a_i][n-(a_i+1)];
        }
        in.close();
        System.out.println(Math.abs(primSum-secSum));
	}
}
