package algorithms.implementation.medium;

import java.util.Scanner;

public class BiggerIsGreater {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0) {
            String str = sc.next();
            char[] word = str.toCharArray();
            nextPermutation(word);
            if(new String(word).equals(str)) {
                System.out.println("no answer");
            }else{
                System.out.println(word);
            }
        }
        sc.close();
    }
    
    public static boolean nextPermutation(char[] array) {
        // Find non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i])
            i--;
        if (i <= 0)
            return false;

        // Find successor to pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;
        char temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
