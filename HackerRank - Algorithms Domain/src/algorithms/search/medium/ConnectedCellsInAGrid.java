package algorithms.search.medium;

import java.util.Scanner;

public class ConnectedCellsInAGrid {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int maxRegion = 0;
        for(int row=0;row<rows;row++) {
            for(int column=0;column<cols;column++) {
                int size = getRegionSize(grid, row, column);
                maxRegion = Math.max(size, maxRegion);
            }
        }
        System.out.println(maxRegion);
    }
    
    static int getRegionSize(int[][] grid, int row, int column) {
        if(row<0 || column<0 || row>=grid.length || column>=grid[row].length) {
            return 0;
        }
        if(grid[row][column]==0) {
            return 0;
        }
        grid[row][column] = 0;
        int size = 1;
        for(int r = row-1; r <= row+1; r++) {
            for(int c = column-1; c <= column+1; c++) {
                if(r != row || c != column) {
                    size += getRegionSize(grid, r, c);
                }
            }
        }
        return size;
    }
}
