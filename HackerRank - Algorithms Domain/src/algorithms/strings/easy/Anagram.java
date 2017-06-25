package algorithms.strings.easy;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n--!=0){
                String str = sc.next();
                if(str.length()%2==0){
                    String s1 = str.substring(0, str.length()/2), s2 = str.substring(str.length()/2, str.length());
                    System.out.println(toMakeItAnagram(s1, s2)/2);
            }else {
                System.out.println("-1");
            }
        }
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