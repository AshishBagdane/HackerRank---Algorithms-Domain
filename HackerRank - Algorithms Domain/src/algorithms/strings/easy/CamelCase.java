package algorithms.strings.easy;

import java.util.Scanner;

public class CamelCase {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine().split("[A-Z]").length);
		scanner.close();
    }
}
