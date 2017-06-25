package algorithms.implementation.easy;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int nChocolates = n/c;
            int wrappers = nChocolates;
            while(wrappers>=m) {
                int newChocolates = wrappers/m;
                nChocolates += newChocolates;
                wrappers %= m;
                wrappers += newChocolates;
            }
            System.out.println(nChocolates);
        }
        sc.close();
	}
}
