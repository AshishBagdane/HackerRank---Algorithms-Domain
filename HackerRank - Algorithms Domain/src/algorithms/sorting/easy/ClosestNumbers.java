package algorithms.sorting.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClosestNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();
        Arrays.sort(num);
        int min = Integer.MIN_VALUE;
        HashMap<Integer,String> pairs = new HashMap<Integer, String>();
        for(int i=0;i<n-1;i++) {
            int diff = 0;
            if((diff = (num[i]-num[i+1]))>min) {
                pairs.put(diff, num[i] + " " + num[i+1]);
            }
        }
        for (Map.Entry<Integer, String> entry : pairs.entrySet()) {
            String value = entry.getValue();
            System.out.println(value);
        }
        sc.close();
    }
}
