package algorithms.strings.easy;

import java.util.Scanner;

public class MarsExploration {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String sent = scanner.next();
        int count=0;
        for(int i=0;i<sent.length();i++) {
            if((i%3==1 && sent.charAt(i)!='O') || (i%3!=1 && sent.charAt(i)!='S')) {
                count++;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
