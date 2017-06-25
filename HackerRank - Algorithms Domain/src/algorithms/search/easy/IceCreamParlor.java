package algorithms.search.easy;

import java.util.Scanner;

public class IceCreamParlor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int cost[] = new int[N];
            int minIndex=-1, maxIndex=-1;
            for(int i=0;i<N;i++) {
                cost[i] = sc.nextInt();
            }
            boolean doExit = false;
            for(int i=0;i<N-1;i++) {
                for(int j=i+1;j<N;j++) {
                    if(cost[i]+cost[j]==M) {
                        if(i<j) {
                            minIndex = i+1;
                            maxIndex = j+1;
                        }else{
                            minIndex = j+1;
                            maxIndex = i+1;
                        }
                        doExit = true;
                        break;
                    }
                }
                if(doExit) {
                    break;
                }
            }
            System.out.println(minIndex + " " + maxIndex);
        }
        sc.close();
    }
}
