package Array_Medium;

import java.util.HashSet;
import java.util.Set;

public class largestConsecutiveNumOptimal {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,2,3};
        System.out.println(fun(arr));

    }
    static int fun(int[] arr){
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for(int i = 0;i<n;i++){
            st.add(arr[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                int count =1;
                int x = it;

                while(st.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                longest =Math.max(longest,count);
            }
        }
        return longest;
    }
}
