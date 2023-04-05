package TimeComplexity;
//Binary Search
public class Time {
    int binarySearch(int[] a,int target,int low,int high)
    {
        if(low > high)
        {
            return -1;
        }
        int mid=(low+high)/2;

        if(a[mid]==target) {
            return mid;
        }
        else if(a[mid] < target)
        {
            return binarySearch(a,target,mid+1,high );
        }
        return binarySearch(a,target,0,mid-1 );
    }

    public static void main(String[] args)
    {
        Time t=new Time();
    int[] a={1,2,3,4,5,6,7};
    int target=7;
    int low=0;
    int high=a.length-1;
    int result=t.binarySearch(a,target,low,high);

    System.out.println("target index!!!!"+ result);


    }
}
