package algorithms.sorting.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort2Sorting {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = in.nextInt(); 
        }
        quickSort(arr, 0 , arr.length-1);
        in.close();
    }
    
    static void quickSort(int[] arr, int low, int high) {
        if(low>high) {
            return;
        }
        int mid = partition(arr, low, high);
        quickSort(arr, low, mid-1);
        quickSort(arr, mid+1, high);
        if(high-low>=1) {
            for(int i=low;i<=high;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    
    static int partition(int[] arr, int low, int high) {
        ArrayList<Integer> leftSubArray = new ArrayList<>();
        ArrayList<Integer> rightSubArray = new ArrayList<>();
        int pivot = arr[low];
        
        for(int i=low+1;i<=high;i++) {
            if(arr[i]<=pivot) {
                leftSubArray.add(arr[i]);
            }else{
                rightSubArray.add(arr[i]);
            }
        }
       
        copy(leftSubArray, arr, low);
        int pivotPosition = leftSubArray.size() + low;
        arr[pivotPosition] = pivot;
        copy(rightSubArray, arr, pivotPosition + 1);
        
        return leftSubArray.size() + low;
    }
    
    static void copy(ArrayList<Integer> list, int ar[], int startIdx) {
        for(int num : list) {
            ar[startIdx++] = num;      
        }
    }
}
