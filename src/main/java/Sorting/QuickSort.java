package Sorting;

//space complexity:O(logN)
//Avergae and best TC:O(NLogN)
//WORST case O(N^2)
public class QuickSort {
    public void quickSorting(int[] arr, int low, int high)
    {
      if(low < high) {
          int pivotIndex = partition(arr, low, high);
          quickSorting(arr, low, pivotIndex - 1);
          quickSorting(arr, pivotIndex + 1, high);
      }
    }

    public int partition(int[] arr, int low, int high)
    {
        int i=low;
        int j=high;
        int pivot=low;
        while(i < j) {
            while (arr[i] <= arr[pivot]) i++;
            while (arr[j] > arr[pivot]) j--;
            if (i < j)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String[] args)
    {
        QuickSort qs=new QuickSort();
        int[] arr={4,6,2,5,7,9,1,3};
        qs.quickSorting(arr,0,arr.length-1);
        for(int i=0; i < arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
