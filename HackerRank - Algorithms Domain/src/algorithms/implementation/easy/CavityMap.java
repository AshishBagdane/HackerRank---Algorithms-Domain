package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CavityMap {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                map[i][j] = (char) br.read();
            }
            br.read();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if((j>0 && j<n-1) && (i>0 && i<n-1)) {
                    if((map[i][j-1]<map[i][j] && map[i][j]>map[i][j+1]) && (map[i-1][j]<map[i][j] && map[i][j]>map[i+1][j])) {
                        System.out.print("X");
                    }else{
                        System.out.print(map[i][j]);
                    }
                }else{
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}
