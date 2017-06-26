package algorithms.greedy.easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Ashish
 */
public class MaximumPerimeterTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lengths = new int[n];
        for(int i=0;i<n;i++) {
            lengths[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(lengths);
        
        PriorityQueue<Triangle> triangles = new PriorityQueue<>();
        
        int minIndex = 0;
        int medIndex = 1;
        int sideMin = lengths[minIndex];
        int sideMed = lengths[medIndex];
        for(int i=0;i<n-2;i++) {
            for(int j=medIndex+1;j<n;j++) {
                if(sideMin+sideMed>lengths[j]) {
                    Triangle t = new Triangle();
                    t.setSideMin(sideMin);
                    t.setSideMed(sideMed);
                    t.setSideLong(lengths[j]);
                    triangles.add(t);
                }
            }
            sideMed = lengths[++medIndex];
            sideMin = lengths[++minIndex];
        }
        
        if(triangles.isEmpty()) {
            System.out.println("-1");
        }else{
            Triangle t = triangles.peek();
            System.out.println(t.getSideMin() + " " + t.getSideMed() + " " + t.getSideLong());
        }
    }
}

class Triangle implements Comparable<Triangle>{

    private int sideMin;

    public int getSideMin() {
        return sideMin;
    }

    public void setSideMin(int sideMin) {
        this.sideMin = sideMin;
    }

    public int getSideMed() {
        return sideMed;
    }

    public void setSideMed(int sideMed) {
        this.sideMed = sideMed;
    }

    public int getSideLong() {
        return sideLong;
    }

    public void setSideLong(int sideLong) {
        this.sideLong = sideLong;
    }
    private int sideMed;
    private int sideLong;

    @Override
    public int compareTo(Triangle t) {
        if(this.getSideLong()>t.getSideLong()) {
            return -1;
        }else if(this.getSideLong()==t.getSideLong()) {
            if(this.getSideMin()>t.getSideMin()) {
                return -1;
            }else{
                return 1;
            }
        }else{
            return 0;
        }
    }
}