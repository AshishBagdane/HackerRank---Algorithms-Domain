package algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        while(n--!=0) {
            integers.add(sc.nextInt());
        }
        int cnt = 0;
        cnt = integers.stream().filter((i) -> (integers.contains(i+d) && integers.contains(i+2*d))).map((_item) -> 1).reduce(cnt, Integer::sum);
        System.out.println(cnt);
        sc.close();
	}
}
