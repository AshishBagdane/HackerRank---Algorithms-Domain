package algorithms.implementation.easy;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i=from;i<=to;i++) {
            if((Math.abs(i - reversed(i)) % k) == 0) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
    
    static int reversed(int number) {
        int result = 0;
        while(number>0) {
            result = (result * 10) + (number % 10);
            number /= 10;
        }
        return result;
    }
}
