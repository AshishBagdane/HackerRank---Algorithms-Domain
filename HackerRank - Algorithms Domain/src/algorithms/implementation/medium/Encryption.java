package algorithms.implementation.medium;

import java.util.Scanner;

public class Encryption {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int cols = (int)Math.ceil(Math.sqrt(text.length()));
        int rows = (int)Math.floor(Math.sqrt(text.length()));
        
        while(rows*cols<text.length()) {
            if(rows<cols) {
                rows++;
            }else{
                cols++;
            }
        }
        
        char[][] textStore = new char[rows][cols];
        int thisIndex = 0;
        int thatIndex = cols;

        for(int i=0;i<rows;i++) {
            textStore[i] = text.substring(thisIndex, thatIndex).toCharArray();
            thisIndex = thatIndex;
            thatIndex += cols;
            if(thatIndex>text.length() && thisIndex!=text.length()) {
                textStore[++i] = text.substring(thisIndex).toCharArray();
                String str = new String(textStore[i]);
                while(str.length()!=cols) {
                    str += " ";
                }
                textStore[i] = str.toCharArray();
            }
        }
        for(int i=0;i<cols;i++) {
            String str = new String();
            for(int j=0;j<rows;j++) {
                str += textStore[j][i];
            }
            System.out.print(str.trim() + " ");
        }
        sc.close();
    }
}
