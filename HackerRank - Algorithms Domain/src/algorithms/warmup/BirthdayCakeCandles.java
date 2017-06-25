package algorithms.warmup;

import java.util.Scanner;
import java.util.TreeMap;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<Integer, Integer> candleHeightCount = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            Integer height = sc.nextInt();
            if(!candleHeightCount.containsKey(height)) {
                candleHeightCount.put(height, 0);
            }
            candleHeightCount.put(height, candleHeightCount.get(height) + 1);
        }
        sc.close();
        System.out.println(candleHeightCount.get(candleHeightCount.lastKey()));
	}
}
