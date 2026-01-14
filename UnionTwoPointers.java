package ArrayEasy;

import java.util.ArrayList;
import java.util.List;

public class UnionTwoPointers {
    public static void main(String[] args) {
        int[] arr1 ={1,1,2,3,4,5,7,9,10};
        int[] arr2 ={4,5,6,7,8};
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(fun(arr1,arr2,n,m));
    }
    public static List<Integer> fun (int[] arr1,int[] arr2,int n,int m){
        List<Integer> union = new ArrayList<>();

        int i =0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);

                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);

                }
                j++;
            }
            else{
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);

            }
                i++;
                j++;
        }
    }
        while(i<n){
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);

        }
            i++;
        }
        while(j<m){
                if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);

        }
            j++;
        }
        return union;
}}
