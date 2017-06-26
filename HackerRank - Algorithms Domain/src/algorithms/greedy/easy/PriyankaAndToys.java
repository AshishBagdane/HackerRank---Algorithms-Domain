package algorithms.greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weights = new int[n];

        for(int i=0;i<n;i++) {
            weights[i] = sc.nextInt();
        }
        Arrays.sort(weights);
        
        int cnt = 0;
        int x = weights[0];
        int y = weights[0]+4;
        for(int i=1;i<n;i++) {
            if(x<=weights[i] && weights[i]<=y) {
                continue;
            }else{
                cnt++;
                x = weights[i];
                y = x + 4;
            }
        }
        
        System.out.println(cnt+1);
        sc.close();
    }
}
