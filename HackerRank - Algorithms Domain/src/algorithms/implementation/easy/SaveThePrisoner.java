package algorithms.implementation.easy;

import java.util.Scanner;

public class SaveThePrisoner {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            s = (s+m-1);
            if(s>n)
                s %= n;
            if(s==0)
                s = n;
            System.out.println(s);
        }
        sc.close();
    }
}
