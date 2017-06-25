package algorithms.strings.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n--!=0) {
            String a  = sc.next();
            Set<Character> b = new HashSet<>();
            int cost = 0;
            for(char ch : a.toCharArray()) {
                if(!b.contains(ch)) {
                    b.add(ch);
                    cost++;
                }
            }
            System.out.println(cost);
        }
        sc.close();
    }
}
