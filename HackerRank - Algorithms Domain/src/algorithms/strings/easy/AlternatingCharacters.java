package algorithms.strings.easy;

import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n--!=0) {
            char[] line = sc.nextLine().toCharArray();
            int count = 0;
            for(int i=0;i<line.length-1;i++) {
                if(line[i]==line[i+1])
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
