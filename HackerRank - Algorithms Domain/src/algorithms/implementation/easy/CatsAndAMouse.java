package algorithms.implementation.easy;

import java.util.Scanner;

public class CatsAndAMouse {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- != 0) {
            int catAPos = sc.nextInt();
            int catBPos = sc.nextInt();
            int mousePos = sc.nextInt();
            System.out.println(getWinner(catAPos, catBPos, mousePos));
        }
        sc.close();
    }
    
    static String getWinner(int catAPos, int catBPos, int mousePos) {
        int catADistance = Math.abs(catAPos - mousePos);
        int catBDistance = Math.abs(catBPos - mousePos);
        if(catADistance == catBDistance) {
            return "Mouse C";
        }else if(catADistance < catBDistance) {
            return "Cat A";
        }else{
            return "Cat B";
        }
    }
}
