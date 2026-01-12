package ArrayEasy;

public class secondLargeEle1 {
    public static void main(String[] args) {
        int[] arr = {5,2,6,8,3};
        int n = arr.length;
    }
    static int fun(int[] arr,int n){
        int max = arr[0];
        int second = -1;//its like dummy

        for(int i =0;i<n;i++){
           if(arr[i]>max){
               max = arr[i];
           }
        }
        for(int i =0;i<n;i++){
            if(arr[i]!=max){
                if(second==-1||arr[i]>second){ //second is used to start this id statement
                    second = arr[i];
                }
            }
        }
        return second;
    }
}