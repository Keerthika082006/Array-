package ArrayEasy;

public class countConsicutive1s {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(fun(arr));

    }
    static int fun(int[] arr){
        int n = arr.length;
        int current = 0;
        int maxi = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                current++;
            }
            else{
                current=0;
            }
            maxi = Math.max(maxi,current);
        }
        return maxi;
    }
}
