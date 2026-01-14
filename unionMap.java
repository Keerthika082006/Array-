package ArrayEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class unionMap {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8};
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(fun(arr1,arr2,n,m));

    }
    static public List<Integer> fun (int[] arr1, int[] arr2 ,int n,int m){
        TreeMap<Integer,Integer> freq = new TreeMap<>();

        for(int i =0;i<n;i++){
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
        }

        for(int i =0;i<m;i++){
            freq.put(arr2[i], freq.getOrDefault(arr1[i],0)+1);
        }

        List <Integer> Union = new ArrayList<>();
        for(int key: freq.keySet()){
            Union.add(key);
        }
        return Union;
    }
}
