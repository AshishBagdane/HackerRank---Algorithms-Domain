package algorithms.implementation.easy;

import java.util.Scanner;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int K = sc.nextInt();
        System.out.println(isPossible(S, T, K) ? "Yes" : "No");
        sc.close();
    }
    
    public static boolean isPossible(String S, String T, int K) {
        int index;
        for(index = 0; index < Math.min(S.length(), T.length()); index++) {
            if(S.charAt(index) != T.charAt(index)) {
                break;
            }
        }
        int nDeletions = S.length() - index;
        int nAppendations = T.length() - index;
        if(nDeletions != 0 && nAppendations != 0) {
            return (nDeletions + nAppendations <= K);
        }else if(nDeletions == 0 && nAppendations != 0) {
            if(nAppendations == K) {
                return true;
            }else{
                return (nAppendations % 2 == 0);
            }
        }else if(nDeletions != 0 && nAppendations == 0) {
            return (nDeletions <= K);
        }else{
            return true;
        }
    }
}
