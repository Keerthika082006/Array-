package Array_Medium;

public class CountSubArrayOptimal {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k = 6;
        System.out.println(fun(arr,k));
    }
    static int fun(int[] arr,int k){
        int n = arr.length;
        int count = 0;

        for(int val:arr){
            int sum = 0;
            sum+=val;
            if(sum==k){
                count++;
            }
        }
    return count;
    }

}
