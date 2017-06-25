package algorithms.implementation.easy;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==b) {
                System.out.println((n-1)*a);
            }else{

                int noA = n-1;
                int noB = 0;

                Set<Integer> lastStones = new TreeSet<>();

                for(int i=0;i<n;i++) {
                    int sum = 0;
                    for(int j=0;j<noA;j++) {
                        sum += a;
                    }
                    for(int j=0;j<noB;j++) {
                        sum += b;
                    }

                    lastStones.add(sum);

                    noA--;
                    noB++;
                }

                lastStones.stream().forEach((stone) -> {
                    System.out.print(stone + " ");
                });
                System.out.println();
            }
        }
        sc.close();
    }
    
    static void otherLogic(Scanner sc) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rows = (int)Math.pow(2, n-1);
            int cols = n;
            int[][] stones = new int[rows][cols];
            int N = rows;
            int fillItem = a;
            for(int colIndex=1;colIndex<cols;colIndex++) {
                N /= 2;
                for(int rowIndex=0;rowIndex<rows;rowIndex++) {
                   if(rowIndex%N==0) {
                       fillItem = (fillItem==a) ? b : a;
                   }
                   stones[rowIndex][colIndex] = fillItem;
                }
            }
            
            Set<Integer> lastStones = new TreeSet<>();
            
            for(int rowIndex=0;rowIndex<rows;rowIndex++) {
                for(int colIndex=1;colIndex<cols;colIndex++) {
                    stones[rowIndex][colIndex] += stones[rowIndex][colIndex-1];
                }
                lastStones.add(stones[rowIndex][cols-1]);
            }
            
            print2DArray(stones, rows, cols);
            
            lastStones.stream().forEach((stone) -> {
                System.out.print(stone + " ");
            });
            System.out.println();
    }
    
    static void print2DArray(int[][] arr, int rows, int cols) {
        for(int rowIndex=0;rowIndex<rows;rowIndex++) {
            for(int colIndex=1;colIndex<cols;colIndex++) {
                System.out.print(arr[rowIndex][colIndex]);
            }
            System.out.println();
        }
    }
}
