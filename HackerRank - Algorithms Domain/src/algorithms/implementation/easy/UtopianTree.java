package algorithms.implementation.easy;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            int N = sc.nextInt();
            System.out.println(heightOfTree(N,1));
        }
        sc.close();
    }
    
    static int heightOfTree(int n, int height) {
        if(n==0)
            return 1;
        else
            for(int i=0;i<n;i++)
                if(i%2==0)
                    height*=2; 
                else 
                    height++;
        return height;
    }
}
