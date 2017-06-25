package algorithms.implementation.easy;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int front = p / 2;
        int back = (n - p) / 2;
        System.out.println(front < back ? front : back);
        in.close();
	}
}
