package Array_Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumBetter {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        System.out.println(Arrays.toString(fun(arr,target)));
    }
    static int[] fun(int[] arr,int target){
        HashMap<Integer,Integer> value = new HashMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
            int complement  = target-arr[i];

            if(value.containsKey(complement)){
                return new int[] {value.get(complement),i};
            }
            value.put(arr[i],i);
        }
        return new int[]{-1,-1};

    }
}
