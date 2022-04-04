//Implementation-> It runs n-1 times loops .
// 2.In every loop every largest element is placed at its right position 
// 3.Comparing the element with it next element if the element is greater than the next element swap them 
// 4.else ignore .
//5. Largest element is placed at end.

import java.util.*;
class BubbleSort{
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        // Time Complexity = O(n^2)It is not good T.C
        //bubble Sort
        for(int i = 0;i<arr.length-1;i++){//n-1
            for(int j = 0; j<arr.length - i - 1;j++){//
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}