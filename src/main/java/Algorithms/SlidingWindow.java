package Algorithms;

public class SlidingWindow {

    public static void main(String[] args)
    {
        int[] arr={5,10,1,12,1};
        int k=3;
        int max=Integer.MIN_VALUE;//helps to get my final result
        int currSum=0;
        int i=0;
        int j=0;

        while(j < arr.length)
        {
            currSum=currSum+arr[j];
            if(j-i+1 < k) {
                j++;
            }else if(j-i+1 == k)
            {
              max=Math.max(currSum,max);
              currSum=currSum-arr[i];
              i++;
              j++;
            }
        }

        System.out.println("max sum from this arrays is"+max);


    }
}
