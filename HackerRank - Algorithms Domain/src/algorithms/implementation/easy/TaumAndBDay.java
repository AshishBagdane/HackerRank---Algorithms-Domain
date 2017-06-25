package algorithms.implementation.easy;

import java.util.Scanner;

public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t--!=0) {
            long nBlack = sc.nextInt();
            long nWhite = sc.nextInt();
            long cBlack = sc.nextInt();
            long cWhite = sc.nextInt();
            long cExchange = sc.nextInt();
            
            long oExpenseBlack = nBlack * cBlack;
            long oExpenseWhite = nWhite * cWhite;
            long totOriginalExpense = oExpenseBlack + oExpenseWhite;
            
            long cMin = Math.min(cBlack, cWhite);
            long minExpenseBlack = Integer.MAX_VALUE, minExpenseWhite = Integer.MAX_VALUE;
            long newCost = cMin;
            
            if(cBlack>cWhite) {
                minExpenseWhite = cMin * nWhite;
                newCost = cMin + cExchange;
                minExpenseBlack = newCost * nBlack;
            }else if(cWhite>cBlack){
                minExpenseBlack = cMin * nBlack;
                newCost = cMin + cExchange;
                minExpenseWhite = newCost * nWhite;
            }
            
            long totMinExpense = minExpenseBlack + minExpenseWhite;
            
            System.out.println(Math.min(totOriginalExpense, totMinExpense));
        }
        sc.close();
    }
}
