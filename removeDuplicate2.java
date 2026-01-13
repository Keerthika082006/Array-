package ArrayEasy;

public class removeDuplicate2 {
    public static void main(String[] args) {
        int[] arr ={1,1,3,4,4,5};
        int n = arr.length;
        System.out.println(fun(arr,n));
    }
  static int fun(int[] arr , int n){
        int k=1;
        if(n==0){
            return 0;
        }
        for(int i =1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
  return k;
}}
