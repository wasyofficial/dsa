package Sorting;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr={34,45,12,31,0};

        for(int i=0; i < arr.length; i++) {
            int smallestNumberResidingIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestNumberResidingIndex]) {
                    smallestNumberResidingIndex = j;
                    //updating the smallest number index
                }
            }
            int temp = arr[smallestNumberResidingIndex];
            arr[smallestNumberResidingIndex] = arr[i];
            arr[i] = temp;
        }

            for(int k=0; k < arr.length; k++)
            {System.out.print(arr[k] + " ");}

        }

}
