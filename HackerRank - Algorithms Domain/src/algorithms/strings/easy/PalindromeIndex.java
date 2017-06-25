package algorithms.strings.easy;

import java.util.Scanner;

public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n--!=0) {
            String word = sc.next();
            int flag = checkPalindrome(word.toCharArray());
            if(flag!=-1) {
                String subString = (word.substring(0, flag) + word.substring(flag+1, word.length()));
                int oflag = checkPalindrome(subString.toCharArray());
                if(oflag!=-1){
                    subString = (word.substring(0, word.length()-(flag+1)) + word.substring((word.length()-(flag+1))+1, word.length()));
                    oflag = checkPalindrome(subString.toCharArray());
                    if(oflag==-1) {
                        flag = word.length()-(flag+1);
                    }
                }
            }
            System.out.println(flag);
        }
        sc.close();
    }
    
    static int checkPalindrome(char[] string) {
        for(int i=0; i<string.length;i++) {
            if(string[i]!=string[string.length-(i+1)]){
                return i;
            }
        }
        return -1;
    }
}
