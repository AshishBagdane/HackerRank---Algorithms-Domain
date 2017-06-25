package algorithms.sorting.easy;

import java.util.Scanner;

public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] num) {
		int key = 0, i;
		for (int j = 1; j < num.length; j++) {
			key = num[j];
			i = j - 1;
			while (i >= 0 && num[i] > key) {
				num[i + 1] = num[i];
				i--;
			}
			num[i + 1] = key;
			printArray(num);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
