package algorithms.strings.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankInAString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Pattern pattern = Pattern.compile(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*");
        StringBuilder output = new StringBuilder();
        while(N-- != 0) {
            String string = sc.next();
            Matcher matcher = pattern.matcher(string);
            output.append((matcher.find()) ? "YES" : "NO").append('\n');
        }
        System.out.println(output);
        sc.close();
    }
}
