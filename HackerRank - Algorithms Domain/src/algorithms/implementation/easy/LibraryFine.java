package algorithms.implementation.easy;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Date on which book is returned
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        
        // Date on which book should be returned
        int DD = sc.nextInt();
        int MM = sc.nextInt();
        int YYYY = sc.nextInt();
        
        sc.close();
        
        int fine;
        
        if(yyyy>YYYY) {
            fine = 10000;
        }else if(mm>MM && yyyy==YYYY) {
            fine = 500 * (mm-MM);
        }else if(dd>DD && mm==MM && yyyy==YYYY) {
            fine = 15 * (dd-DD);
        }else{
            fine = 0;
        }
        
        System.out.println(fine);
    }
}
