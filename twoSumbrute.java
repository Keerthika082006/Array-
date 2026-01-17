package Array_Medium;

import java.util.Arrays;

public class twoSumbrute {
    public static void main(String[] args) {
        int[] arr = {1,5,2,9,10};
        int target = 11;
        System.out.println(Arrays.toString(fun(arr,target)));
    }
    static int[] fun(int[] arr, int target){
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
      return new int[] {-1,-1};
    }

}
