package algorithms.bitmanipulation.easy;

import java.util.Hashtable;
import java.util.Scanner;

public class LonelyInteger {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Hashtable<Integer, Integer> num = new Hashtable<>();
		while (n-- != 0) {
			int keyval = sc.nextInt();
			if (num.containsKey(keyval) == false) {
				num.put(keyval, keyval);
			} else {
				num.remove(keyval);
			}
		}
		num.values().stream().forEach((value) -> {
			System.out.println(value);
		});
		sc.close();
	}
}
