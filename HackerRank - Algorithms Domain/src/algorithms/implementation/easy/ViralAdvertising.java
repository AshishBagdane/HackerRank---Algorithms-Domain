package algorithms.implementation.easy;

import java.util.Scanner;

public class ViralAdvertising {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        int totalLikes = Math.floorDiv(5, 2);
        int receivedBy = Math.floorDiv(5, 2) * 3;
        while(n--!=0) {
            int nLikes = Math.floorDiv(receivedBy, 2);
            receivedBy = nLikes * 3;
            totalLikes += nLikes;
        }
        sc.close();
        System.out.println(totalLikes);
    }
}
