package algorithms.sorting.easy;

import java.util.Scanner;

public class CountingSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[100];
        while(n--!=0) {
            numbers[sc.nextInt()]++;
        }
        sc.close();
        for(int number : numbers) {
            System.out.print(number + " ");
        }
	}
}
