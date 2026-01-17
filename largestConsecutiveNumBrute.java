package Array_Medium;



public class largestConsecutiveNumBrute {
    public static void main(String[] args) {
        int[] arr = {100,1,56,3,2,5,4};
        System.out.println(longesCon(arr));


    }
    static boolean linearSearch(int[] arr,int num){
        int n = arr.length;
        for(int i = 0;i<n;i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    static  int longesCon (int[] arr){
        int m = arr.length;
        if(m==0){
            return 0;
        }
        int longest = 1;
        for(int i =0;i<m;i++){
            int x = arr[i];
            int count = 1;

            while(linearSearch( arr,x+1)){
                x+=1;
                count+=1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}
