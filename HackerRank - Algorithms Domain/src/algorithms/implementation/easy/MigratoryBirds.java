package algorithms.implementation.easy;

import java.util.Scanner;

public class MigratoryBirds {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] birdCount = new int[6];
        
        for(int i = 1; i <= N; i++) {
            int type = sc.nextInt();
            birdCount[type]++;
        }
        
        sc.close();
        
        int mostFrequentType = 1;
        
        for(int i = 1; i <= 5; i++) {
            if(birdCount[mostFrequentType] < birdCount[i]) {
                mostFrequentType = i;
            }
        }
        
        System.out.println(mostFrequentType);
    }
}
