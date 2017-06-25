package algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aScore = 0, bScore = 0;
        byte[] a = new byte[3];
        a = readArray(a, sc);
        byte[] b = new byte[3];
        b = readArray(b, sc);
        for(int i=0;i<3;i++) {
            if(a[i]>b[i]) {
                aScore++;
            }else if(b[i]>a[i]) {
                bScore++;
            }
        }
        sc.close();
        System.out.println(aScore + " " + bScore);
    }
    
    static byte[] readArray(byte [] arr, Scanner sc) {
        for(byte i=0;i<arr.length;i++) {
            arr[i] = sc.nextByte();
        }
        return arr;
    }
}
