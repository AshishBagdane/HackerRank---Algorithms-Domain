package algorithms.implementation.easy;

import java.util.Scanner;

public class JumpingOnTheClouds {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        byte[] clouds = new byte[n];
        for(int i=0;i<n;i++) {
            clouds[i] = sc.nextByte();
        }
        sc.close();
        int i = 0, jumps = 0;
        while(i!=n-1) {
            if(i+2<=n-1 && clouds[i+2]==0) {
                i+=2;
            }else {
                i++;
            }
            jumps++;
        }
        System.out.println(jumps);
    }
}
