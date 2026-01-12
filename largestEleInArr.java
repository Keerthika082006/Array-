package ArrayEasy;

public class largestEleInArr {
    public static void main(String[] args) {
        int[] arr={4,2,5,6,32,7};
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp =arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        System.out.println(arr[n-1]);
    }
}
