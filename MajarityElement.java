package Array_Medium;

public class MajarityElement {
    public static void main(String[] args) {
        int[] arr = {6,5,5 };
        System.out.println(fun(arr));
    }
    static int fun(int[] arr){
        int n = arr.length;

        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int[] Hash =new int[maxi+1];

        for(int i=0;i<n;i++){
            Hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(Hash[arr[i]]>n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
