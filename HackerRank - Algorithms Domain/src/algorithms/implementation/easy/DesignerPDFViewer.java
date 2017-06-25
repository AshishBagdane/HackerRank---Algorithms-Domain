package algorithms.implementation.easy;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] letterHeights = new int[26];
        for(int i=0;i<26;i++) {
            letterHeights[i] = sc.nextInt();
        }
        sc.nextLine();
        String str = sc.next();
        int maxHeight = Integer.MIN_VALUE;
        for(char ch : str.toCharArray()) {
            if(letterHeights[ch - 97] > maxHeight) {
                maxHeight = letterHeights[ch - 97];
            }
        }
        sc.close();
        System.out.println(maxHeight * str.length());
	}
}
