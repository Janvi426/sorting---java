import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    
    // Bubble sort   TC = O(n^2)
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    // printing sorted array  
    public static void printArr(int arr[]){
        System.out.print("sorted array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // optimized bubble sort 
    // TC=O(n^2)in worst case but when array is already sorted then TC=O(n) in optimized code
    public static void optimizedBubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    
    // Selection sort   TC = O(n^2)
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort  TC = O(n^2)
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the currect position to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    // counting sort  TC = O(n+range) means linear
    public static void countingSort(int arr1[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){
            largest = Math.max(largest,arr1[i]);
        }
        // make count array
        int count[] = new int[largest+1];
        for(int i=0; i<count.length; i++){
            count[arr1[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr1[j] = i;
                j++;
                count[i]--;
            }
        }
    }
   

    public static void main(String...arg){
        int arr[] = {2, 1 ,5, 4, 3};
        int arr1[] = {1 ,4 ,1, 3, 2, 4, 3, 7};
        //bubbleSort(arr);
        //optimizedBubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //countingSort(arr1);
        
        //Arrays.sort(arr);       // inbuilt sort ascending
        //Arrays.sort(arr,0,3);   // in. sort form index 0 to 3(first 3)
       
        // to run descending.. - replace int arr[] by Integer arr[]
        // like Integer arr[] = {2,1,5,4,3}
        
        //Arrays.sort(arr,Collections.reverseOrder());       // in.sort descending 
        //Arrays.sort(arr,0,3,Collections.reverseOrder());
        
        printArr(arr);   // for countingSort printArr(arr1) also make change in fun printArr
       
    }
    
}
