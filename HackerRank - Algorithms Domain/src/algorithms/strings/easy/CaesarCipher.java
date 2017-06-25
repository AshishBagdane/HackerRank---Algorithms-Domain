package algorithms.strings.easy;

import java.util.Scanner;

public class CaesarCipher {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String str = sc.next();
        int k = sc.nextInt();
        String res = "";
        for(char ch : str.toCharArray()) {
                res += (!Character.isAlphabetic(ch)) ? ch : getEncryptedChar(ch, k);
        }
        System.out.println(res);
        sc.close();
    }
    
    static char getEncryptedChar(char ch, int k) {
        return (Character.isUpperCase(ch)) ? (char)('A' + ((ch - 'A') + k) % 26) : (char) ('a' + (ch - 'a' + k) % 26);
    }
}
