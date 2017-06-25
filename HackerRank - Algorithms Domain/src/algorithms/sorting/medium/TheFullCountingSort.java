package algorithms.sorting.medium;

import java.util.Scanner;

public class TheFullCountingSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        NumWord[] numWords = new NumWord[n];
        for(int i=0;i<n;i++) {
            int num = sc.nextInt();
            if(num>max) {
                max = num;
            }
            String word = sc.next();
            numWords[i] = new NumWord(num, word, (i<(n/2)));
        }
        sc.close();
        numWords = countingSort(numWords, max);
        StringBuffer result = new StringBuffer();
        for(NumWord numWord : numWords) {
            result = result.append((numWord.isFirstHalf()) ? "-" : numWord.getWord()).append(" ");
        }
        System.out.println(result);
    }
    
    static NumWord[] countingSort(NumWord[] numWords, int max) {
        int[] count = new int[max+1];
        for(NumWord numWord : numWords) {
            count[numWord.getNum()]++;
        }
        for(int i=1;i<count.length;i++) {
            count[i] += count[i-1];
        }
        NumWord[] nwsResult = new NumWord[numWords.length];
        for(int i=numWords.length-1;i>=0;i--) {
            nwsResult[--count[numWords[i].getNum()]] = numWords[i];
        }
        return nwsResult;
    }
    
    static class NumWord {

        private int num;
        private String word;
        private boolean firstHalf;

        public NumWord() {
        }

        public NumWord(int num, String word, boolean firstHalf) {
            this.num = num;
            this.word = word;
            this.firstHalf = firstHalf;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public boolean isFirstHalf() {
            return firstHalf;
        }

        public void setFirstHalf(boolean firstHalf) {
            this.firstHalf = firstHalf;
        }
    }
}
