package Algorithms;

public class TargetSum {

    int[] targetSumFinding(int[] arr, int target)
    {
       int[] result= new int[2];
       int i=0;
       int j=arr.length-1;
        while(i < j)
        {
            if(arr[i]+arr[j] == target)
            {
                result[0]=i;
                result[1]=j;
                return result;
            }
            else if(arr[i]+arr[j] < target)
            {
                i++;
            }
            else{
                j--;
            }
        }
        result[0]=-1;
        result[1]=-1;
       return result;
    }

    public static void main(String[] args)
    {
        TargetSum ts=new TargetSum();
        int[] arr={10,11,12,36};
        int target=23;

        int[] foundResult=ts.targetSumFinding(arr,target);

        System.out.println(foundResult[0]+ " "+foundResult[1]);

    }
}
