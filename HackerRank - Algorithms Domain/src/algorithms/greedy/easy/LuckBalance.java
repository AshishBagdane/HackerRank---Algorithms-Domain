package algorithms.greedy.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int savedLuck = 0;
        ArrayList<Integer> imp = new ArrayList<>();
        while(n--!=0) {
            int L = sc.nextInt();
            int T = sc.nextInt();
            if(T==1) {
                imp.add(L);
            }else{
                savedLuck += L;
            }
        }
        sc.close();
        Collections.sort(imp);
        int count = 1;
        for(int i=imp.size()-1;i>=0;i--) {
            if(count++<=k)
                savedLuck += imp.get(i);
            else
                savedLuck -= imp.get(i);
        }
        System.out.println(savedLuck);
    }
}
