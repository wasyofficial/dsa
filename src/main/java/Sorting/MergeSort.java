package Sorting;

import java.util.Arrays;

public class MergeSort {

    void mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid= (low+high)/2;
            //left part
            mergeSort(arr,low, mid);
            //right part
            mergeSort(arr,mid+1, high);
            //merge two parts in sorted manner
            merge(arr,low,mid,high);
        }
    }
    public void merge(int[] arr, int low, int mid, int high)
    {
        int[] result=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i <= mid && j <=high) {
            if (arr[i] <= arr[j]) {
                result[k] = arr[i];
                i++;
                k++;
            } else {
                result[k] = arr[j];
                j++;
                k++;
            }
        }
            while(i <= mid)
            {
                result[k]=arr[i];
                i++;
                k++;
            }
            while(j <= high)
            {
                result[k]=arr[j];
                j++;
                k++;
            }


        for(int x=0,m=low;x < result.length;m++,x++ )
        {
            arr[m]=result[x];
        }

    }
    
    public static void main(String[] args){
        MergeSort ms=new MergeSort();
        int[] arr={23,4,2,5,6,23,565,67};
        ms.mergeSort(arr,0,arr.length-1);
        for(int i=0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    }
