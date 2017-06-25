package algorithms.strings.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] letters = in.nextLine().toCharArray();
        Set<Character> chars = new HashSet<>();
        for(int i=0;i<letters.length;i++) {
            if(letters[i]!=' ') {
                chars.add(Character.toLowerCase(letters[i]));
            }
        }
        if(chars.size()<26 || chars.size()>26) {
            System.out.println("not pangram");
        }else if(chars.size()==26) {
            System.out.println("pangram");
        }
        in.close();
    }
}
