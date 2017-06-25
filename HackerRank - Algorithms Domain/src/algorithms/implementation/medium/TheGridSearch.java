package algorithms.implementation.medium;

import java.util.Scanner;

public class TheGridSearch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextByte();
        while(testCases--!=0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            String[] mainGrid = new String[R];
            for(int i=0;i<R;i++)
                mainGrid[i] = sc.next().trim();
            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            String[] subGrid = new String[r];
            for(int i=0;i<r;i++)
                subGrid[i] = sc.next().trim();
            System.out.println(isSubGrid(mainGrid, R, C, subGrid, r, c));
        }
        sc.close();
    }
    
    static String isSubGrid(String[] mainGrid, int R, int C, String[] subGrid, int r, int c) {
            int l;
            int rows = (R-r==0) ? R : R-r+1;
            for(int i=0;i<rows;i++) {
                int smallIndex=0,largeIndex=c;
                while(largeIndex<=C) {
                    if(mainGrid[i%rows].substring(smallIndex, largeIndex).equals(subGrid[0])){
                        int newCheckSub = 1;
                        for(l=i+1; l<i+r; newCheckSub++,l++) {
                            if(mainGrid[l].substring(smallIndex, largeIndex).equals(subGrid[newCheckSub])==false) {
                                break;
                            }
                        }
                        if(l-i==r) {
                            return "Yes";
                        }
                    }
                    smallIndex++;
                    largeIndex++;
                }
            }
        return "No";
    }
}
