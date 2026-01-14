package ArrayEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionSet {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {5,6,7,8,9};
        System.out.println(findUnion(arr1,arr2));
    }
    static public List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> st = new TreeSet<>();

        for(int num:arr1){
            st.add(num);
        }
        for(int num:arr2){
            st.add(num);
        }
        return new ArrayList<>(st);
    }

}
