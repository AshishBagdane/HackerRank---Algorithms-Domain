package algorithms.strings.easy;

import java.util.Scanner;

/**
 *
 * @author HCL
 */
public class MakingAnagrams {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toMakeItAnagram(sc.next(), sc.next()));
        sc.close();
    }
    
    static int toMakeItAnagram(String one, String two) {        
        int cArr[]=new int[26];
        for(int i=0;i<one.length();i++)cArr[one.charAt(i)-97]++;
        for(int i=0;i<two.length();i++)cArr[two.charAt(i)-97]--;
        int count=0;
        for(int i=0;i<26;i++)count+=Math.abs(cArr[i]);
        return count;
    }
}