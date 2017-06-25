package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int posCount = 0, negCount = 0, zeroCount = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0)
                zeroCount++;
            else if(arr[arr_i]>0)
                posCount++;
            else
                negCount++;
        }
        in.close();
        System.out.println(String.format("%.6f",(double)posCount/n));
        System.out.println(String.format("%.6f",(double)negCount/n));
        System.out.println(String.format("%.6f",(double)zeroCount/n));
	}
}
