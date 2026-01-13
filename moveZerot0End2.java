package ArrayEasy;

import java.util.Arrays;

public class moveZerot0End2 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,0,3,0,0};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void fun(int[] arr){
       int n = arr.length;
       int j =0;

       for(int i = 0;i<n;i++){
           if(arr[i]!=0){
               arr[j]=arr[i];
               j++;
           }
       }
       while(j<n){
           arr[j]=0;
           j++;
       }
    }
}