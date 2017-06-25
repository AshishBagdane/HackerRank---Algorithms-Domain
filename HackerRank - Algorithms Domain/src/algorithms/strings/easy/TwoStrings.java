package algorithms.strings.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            System.out.println(checkSubstring(sc.next(), sc.next()));
        }
        sc.close();
    }
    
    static String checkSubstring(String A, String B) {
        Set<Character> setA = A.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        Set<Character> interCharacters = new HashSet<>(setA);
        Set<Character> setB = B.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        interCharacters.retainAll(setB);
        if(interCharacters.size()!=0)
            return "YES";
        else
            return "NO";
    }
}
