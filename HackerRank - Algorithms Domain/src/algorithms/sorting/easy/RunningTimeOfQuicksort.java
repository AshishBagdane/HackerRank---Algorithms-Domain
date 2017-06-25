package algorithms.sorting.easy;

import java.util.Scanner;

public class RunningTimeOfQuicksort {
    static int quickCount = 0;
    static int insertCount = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i=0;i<n;i++) {
            arrA[i] = arrB[i] = sc.nextInt();
        }
        Quicksort(arrA, 0, n-1);
        insertionSort(arrB);
        System.out.println(insertCount-quickCount);
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
                quickCount++;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        quickCount++;
        return i+1;
    }
    
    static void insertionSort(int[] num) {
        int key = 0, i;
        for(int j=1;j<num.length;j++) {
            key = num[j];
            i = j-1;
            while(i>=0 && num[i]>key) {
                num[i+1] = num[i];
                insertCount++;
                i--;
            }            
            num[i+1] = key;
        }
    }
}
