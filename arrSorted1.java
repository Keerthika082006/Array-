package ArrayEasy;

public class arrSorted1 {
    public static void main(String[] args) {
        int[] arr = {2, 2,3, 4, 6};
        System.out.println(fun(arr));

    }
    static boolean fun(int[] arr){
       // int sort =arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
