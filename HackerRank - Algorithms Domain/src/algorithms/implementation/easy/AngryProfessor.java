package algorithms.implementation.easy;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0){ 
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] studArrival = new int[n];
            for(int i=0;i<n;i++)
                studArrival[i] = sc.nextInt();
            System.out.println(isClassCancelled(n, k, studArrival));
        }
        sc.close();
    }
    
    static String isClassCancelled(int n, int k, int[] studArrival) {
            int onTime=0;
            for(int i=0;i<n;i++) {
                if(studArrival[i]<=0 && onTime<k)
                    onTime++;
                else if(onTime>=k)
                    return "No";
            }
            return "Yes";
    }
}
