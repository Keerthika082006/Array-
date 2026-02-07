package Array_Medium;

import java.util.Arrays;

public class nextPermutationOptimal {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;

        //To find the pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        //if no pivot found
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        // Find just larger element
        for (int i = n - 1; i > index; i--) {
            //swap
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }
        //reverse the element after the pivot
        reverse(arr, index + 1, n - 1);
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

}
