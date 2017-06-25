package algorithms.implementation.easy;

import java.util.Scanner;

public class FlatLandSpaceStations {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cities = new int[n];  // 1: Space Station 0: City
        int[] ssDistances = new int[n];
        for(int i=0;i<m;i++) {
            cities[sc.nextInt()] = 1;
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            ssDistances[i] = getNearestSpaceStationDistance(cities, i);
            if(ssDistances[i]>max) {
                max = ssDistances[i];
            }
        }
        System.out.println(max);
    }
    
    static int getNearestSpaceStationDistance(int[] cities, int cityIndex) {
        int leftDistance = 0;
        int rightDistance = 0;
        
        boolean foundToLeft = false;
        boolean foundToRight = false;
        
        for(int i=cityIndex;i>=0;i--) {
            if(cities[i]!=1) {
                leftDistance++;
            }else{
                foundToLeft = true;
                break;
            }
        }
        
        for(int i=cityIndex;i<cities.length;i++) {
            if(cities[i]!=1) {
                rightDistance++;
            }else{
                foundToRight = true;
                break;
            }
        }
        
        if(leftDistance<rightDistance) {
            return (foundToLeft) ? leftDistance : rightDistance;
        }else{
            return (foundToRight) ? rightDistance : leftDistance;
        }
    }
}
