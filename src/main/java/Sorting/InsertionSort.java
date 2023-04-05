package Sorting;

public class InsertionSort {

    public static void main(String[] args)
    {
        int[] arr={5,78,15,78,35,18};
        for(int i=1; i < arr.length; i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        for(int k=0; k < arr.length; k++)
        {
            System.out.print(arr[k]+" ");
        }

    }
}
