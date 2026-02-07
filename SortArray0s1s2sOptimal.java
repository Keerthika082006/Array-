package Array_Medium;

import java.util.Arrays;

public class SortArray0s1s2sOptimal {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void fun(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high]=temp;
               high--;
            }
        }
    }
}
