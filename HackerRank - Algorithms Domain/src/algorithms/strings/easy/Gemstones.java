package algorithms.strings.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Gemstones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        Set<Character> str1 = sc.next().chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        Set<Character> interCharacters = new HashSet<>(str1);
        while(n--!=0){
            Set<Character> str2 = sc.next().chars().mapToObj(e->(char)e).collect(Collectors.toSet());
            interCharacters.retainAll(str2);
        }
        sc.close();
        System.out.println(interCharacters.size());
    }
}
