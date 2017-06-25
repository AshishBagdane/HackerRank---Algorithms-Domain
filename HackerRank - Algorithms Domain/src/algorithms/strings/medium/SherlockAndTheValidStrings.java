package algorithms.strings.medium;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class SherlockAndTheValidStrings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<Character> uniqueCharacters = new TreeSet<>();
        HashMap<Integer, TreeSet<Character>> countChars = new HashMap<>();
        for(char ch : s.toCharArray()) {
            uniqueCharacters.add(ch);
        }
        
        int[] countStore = new int[uniqueCharacters.size()];
        int countIndex = 0;
        
        for(char ch : uniqueCharacters) {
            String sCopy = new String(s);
            int count = sCopy.length() - sCopy.replace(String.valueOf(ch), "").length();
            if(countChars.get(count)==null) {
                countChars.put(count, new TreeSet<>());
                countStore[countIndex++] = count;
            }
            countChars.get(count).add(ch);
        }
        
        switch (countChars.size()) {
            case 1:
                System.out.println("YES");
                break;
            case 2:
                int second = countChars.get(countStore[1]).size()*countStore[1];
                if(countChars.get(countStore[1]).size()==1) {
                    System.out.println("YES");
                }else{
                    System.out.println((second>1) ? "NO" : "YES");
                }
                break;
            default:
                System.out.println("NO");
                break;
        }
        
        sc.close();
    }
}
