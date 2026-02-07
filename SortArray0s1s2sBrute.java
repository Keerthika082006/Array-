package Array_Medium;

import java.util.Arrays;

public class SortArray0s1s2sBrute {
    public static void main(String[] args) {
        int[] arr= {1,0,2,1,2,0};
        fun(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void fun(int[] arr){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int num:arr){
            if(num==0){
                count0++;
            }
            else if(num==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int index =0;
        while(count0-->0){
            arr[index++]=0;
        }
        while(count1-->0){
            arr[index++]=1;
        }
        while(count2-->0){
            arr[index++]=2;
        }

    }
}
