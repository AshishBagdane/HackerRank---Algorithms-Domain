package algorithms.implementation.easy;

import java.util.Scanner;
import java.util.TreeSet;

public class SockMerchant {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        TreeSet<Integer> socks = new TreeSet<>();
        
        for(int i=0;i<n;i++) {
            int sock = sc.nextInt();
            if(socks.contains(sock)) {
                socks.remove(sock);
                count++;
            }else{
                socks.add(sock);
            }
        }
        
        sc.close();
        
        System.out.println(count);
    }
}
