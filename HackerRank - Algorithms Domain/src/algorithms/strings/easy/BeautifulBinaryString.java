package algorithms.strings.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        Matcher matcher = Pattern.compile("010").matcher(sc.nextLine());
        int count = 0;
        while(matcher.find()) {
            count++;
        }
        sc.close();
        System.out.println(count);
    }
}
