package ArrayEasy;

public class FindNumApperesOnes {
    public static void main(String[] args) {
        int[] arr = {1,2,2,10,10,9,1};
        System.out.println(fun(arr));
    }
    static int fun(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }}
                if (count == 1) {
                    return num;
                }

            }

    return -1;
    }

}
