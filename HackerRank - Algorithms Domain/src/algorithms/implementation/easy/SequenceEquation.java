package algorithms.implementation.easy;

import java.util.HashMap;
import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> valueIndexMap = new HashMap<>();
        for(int index = 1; index <= N; index++) {
            int value = sc.nextInt();
            valueIndexMap.put(value, index);
        }
        sc.close();
        for(int i = 1; i <= N; i++) {
            System.out.println(valueIndexMap.get(valueIndexMap.get(i)));
        }
	}
}
