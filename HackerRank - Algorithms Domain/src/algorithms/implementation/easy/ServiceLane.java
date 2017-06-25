package algorithms.implementation.easy;

import java.util.Scanner;

public class ServiceLane {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] width = new int[N];
        int T = sc.nextInt();
        for(int i=0;i<N;i++) {
            width[i] = sc.nextInt();
        }
        while(T--!=0) {
            int entry = sc.nextInt();
            int exit = sc.nextInt();
            System.out.println(getVehicle(width, entry, exit));
        }
        sc.close();
    }
    
    static int getVehicle(int[] width, int entry, int exit) {
        int min = Integer.MAX_VALUE;
        for(int i=entry;i<=exit;i++) {
            if(width[i]<min) {
                min = width[i];
            }
        }
        return min;
    }
}
