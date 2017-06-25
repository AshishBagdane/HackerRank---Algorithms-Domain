package algorithms.sorting.medium;

import java.util.Scanner;

public class QuickSort3InPlace {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Quicksort(arr, 0, n-1);
        sc.close();
    }
    
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    static void Quicksort(int[] arr, int low, int high) {
        if(low<high) {
            int mid = partition(arr, low, high);
            printArray(arr);
            Quicksort(arr, low, mid-1);
            Quicksort(arr, mid+1, high);
        }
    }
    
    static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for(int j=low; j<=high-1;j++) {
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
