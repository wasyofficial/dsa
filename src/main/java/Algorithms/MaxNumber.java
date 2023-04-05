package Algorithms;

public class MaxNumber {
//TC:O(N*K)
    //SC:o(1)
    public static void main(String[] args) {
        int[] arr = {5, 5,5,2};
        int k = 3;
        int i = 0;
        int currMax;
while(i <= arr.length-k){
        currMax = arr[i];
        for (int j = i; j - i + 1 <= k; j++) {
            currMax = Math.max(currMax, arr[j]);
        }
        System.out.print(currMax + " ");
        i++;
    }



    }
}
