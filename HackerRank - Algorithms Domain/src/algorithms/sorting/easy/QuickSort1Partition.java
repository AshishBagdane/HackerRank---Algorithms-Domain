package algorithms.sorting.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort1Partition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt(); 
        }
        int p = ar[0];
        ArrayList<Integer> lower = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> upper = new ArrayList<>();
        for(int i : ar) {
            if(i<p)
                lower.add(i);
            else if(i==p)
                equal.add(i);
            else
                upper.add(i);
        }
        lower.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
        equal.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
        upper.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
        in.close();
    }
}
